package LambdasAndStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Runnable task : create a class
        Runnable runnable = () -> {
            System.out.println("Hello World");
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("Hello World"));

//        comparator : compare
        List<Integer> list = new ArrayList<>();
        list.add(31);
        list.add(22);
        list.add(33);
        list.add(14);


        Collections.sort(list, (x , y) -> y * y - x * x);

//        Method references
        MathematicalOperation addition = Integer::sum;
        MathematicalOperation subtraction = (a , b) -> a - b;
        MathematicalOperation multiplication = (a , b) -> a * b;
        MathematicalOperation division = (a , b) -> a /  b;

        System.out.println(addition.operation(2 , 4));


    }
}
