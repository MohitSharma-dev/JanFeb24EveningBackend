package ConstructorChaining;

public class B extends A {
    B(){
        System.out.println("Constructor of B");
    }

    B(int a){
        this();
        System.out.println("Constructor of B with a :" + a);
    }

    B(int a, int b){
//        this(...) also has to be in the first line
        this(5); // B(5)
        System.out.println("Constructor of B with a :" + a + " and b:" + b);
    }
}

// D -> C -> B (5 , 10) -> B(5) -> B() -> A()