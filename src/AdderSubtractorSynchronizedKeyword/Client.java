package AdderSubtractorSynchronizedKeyword;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();

        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Void> adderFuture = executor.submit(adder);
        Future<Void> subtractorFuture = executor.submit(subtractor);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println(value.x);
    }
}
