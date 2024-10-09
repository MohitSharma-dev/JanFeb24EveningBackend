package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value value;
    private Lock lock;

    Adder(Value value, Lock lock){
        this.value = value;
        this.lock = lock;
    }
    @Override
    public Void call() throws Exception {
//        lock.lock();
        for(int i = 1; i <= 10000; i ++){
//             critical section start
            lock.lock();
            System.out.println("Adder is adding : " + i);
            this.value.x += i;
            lock.unlock();
//            critical section end
        }
//        lock.unlock();
        return null;
    }
}
