package Generics;

import java.util.Comparator;

public class GenericPair <T, V>{
    T first;
    V second;

    public GenericPair() {
        this.first = null;
        this.second = null;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

   public static <E> E doSomething(E third){
        return third;
   }

    public <E extends Number> Number getMix(E x, E y){
        return (x.doubleValue() + y.doubleValue());
    }
}


