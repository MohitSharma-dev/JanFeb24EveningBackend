package ConstructorChaining;

public class C extends B{

    C(){
//        it has to be the first line
        super(5 , 10);
        // the line written below is wrong
        // super(5);// B(5 , 10);
        System.out.println("Constructor of C");
    }
}

// We want to construct the parent first and then the child
