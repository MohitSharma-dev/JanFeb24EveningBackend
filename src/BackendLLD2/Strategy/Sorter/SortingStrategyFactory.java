package BackendLLD2.Strategy.Sorter;

public class SortingStrategyFactory {
    public static SortingStrategy getSortingStrategyByDataSize(Integer dataSize) {
        SortingStrategy sortingStrategy = null;
        if(dataSize <= 10){
            sortingStrategy = new QuickSort();
        } else if(dataSize <= 100){
            sortingStrategy = new HeapSort();
        } else{
            sortingStrategy = new MergeSort();
        }
        return sortingStrategy;
    }
}
