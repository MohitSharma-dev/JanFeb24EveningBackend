package AdderSubtractorSynchronizedKeyword;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value value;

    Subtractor(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1 ; i <= 100 ; i++) {
            synchronized (value) {
                this.value.x -= i;
            }
        }
        return null;
    }
}
