package ProducerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);

        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        ExecutorService ex = Executors.newCachedThreadPool();

        for(int i = 1; i <= 8; i++){
            Producer producer = new Producer(store, producerSemaphore, consumerSemaphore);
            ex.execute(producer);
        }

        for(int i = 1; i <= 20; i++){
            Consumer consumer = new Consumer(store, producerSemaphore, consumerSemaphore);
            ex.execute(consumer);
        }


    }
}
