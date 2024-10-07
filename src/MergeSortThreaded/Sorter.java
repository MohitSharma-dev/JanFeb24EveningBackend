package MergeSortThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    Sorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
//        Base condition
        if(arrayToSort.size() == 1){

            return arrayToSort;
        }

        int mid = arrayToSort.size()/2;



        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();


//        you can also use sublist instead of for loop


        for(int i = 0; i < mid; i++){
            leftArray.add(arrayToSort.get(i));
        }

        for(int i = mid; i < arrayToSort.size(); i++){
            rightArray.add(arrayToSort.get(i));
        }

        Sorter leftArraySorter =  new Sorter(leftArray, executorService);
        Sorter rightArraySorter = new Sorter(rightArray, executorService);
//        callable : submit
//        runnable : execute

//         it returns a Future
        Future<List<Integer>> leftArrayFuture  = executorService.submit(leftArraySorter);
        Future<List<Integer>> rightArrayFuture =  executorService.submit(rightArraySorter);

//        We have to wait for both the threads to get completed
        List<Integer> sortedLeftArray =  leftArrayFuture.get();
        List<Integer> sortedRightArray = rightArrayFuture.get();



//        merge two sorted arrays

        int i= 0;
        int j = 0;
        List<Integer> sortedArray = new ArrayList<>();
        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }
        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }
        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }


        return sortedArray;
    }
}
