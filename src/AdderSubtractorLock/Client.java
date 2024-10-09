package AdderSubtractorLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // shared data
        Value value = new Value();

        Lock lock = new ReentrantLock();

        Adder adder = new Adder(value, lock);
        Subtractor subtractor = new Subtractor(value, lock);



        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Void> adderFuture = executor.submit(adder);
        Future<Void> subtractorFuture = executor.submit(subtractor);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println(value.x);
    }
}
