package AdderSubtractatorSynchronizedMethods;

public class Value {
    public int x = 0;

    public synchronized void incrementBy(int i){
        x += i;
    }

    public synchronized void decrementBy(int i){
        x -= i;
    }
}
