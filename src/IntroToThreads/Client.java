package IntroToThreads;

public class Client {
    public static void doSomething(){
        System.out.println("Something uis beign done " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
//        Runnable helloWorldPrinter = new HelloWorldPrinter();
//        System.out.println("Thread : " + Thread.currentThread().getName());
//        Thread t = new Thread(helloWorldPrinter);
//        t.start();
//        doSomething();

        for(int i = 1; i <= 1000000; i++){
//            if( i == 80){
//                System.out.println();
//            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t1 = new Thread(numberPrinter);
            t1.start();
        }

    }
//    Question : Print 1 -> 100 . But every number should be printed in a separate thread
}


// Via Runnable
// Extend thread class itself