package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex =  Executors.newCachedThreadPool();

        for(int i =0 ; i < 1000000; i ++){
//            if(i == 6700){
//                System.out.println();
//            }
            NumberPrinter x = new NumberPrinter(i);
            ex.execute(x);
        }
    }
}
