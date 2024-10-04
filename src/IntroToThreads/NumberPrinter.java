package IntroToThreads;

public class NumberPrinter implements Runnable{
    private int noToPrint;

    NumberPrinter(int x){
        noToPrint = x;
    }

    @Override
    public void run() {
        System.out.println("Number :" + noToPrint + " Thread : " + Thread.currentThread().getName());
    }
}
