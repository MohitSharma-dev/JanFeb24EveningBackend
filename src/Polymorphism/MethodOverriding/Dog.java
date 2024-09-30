package Polymorphism.MethodOverriding;

public class Dog extends Animal {
    public void makeSound(){
        super.makeSound();
        System.out.println("Bhau Bhau Bhau");
    }

    public void eat(){
        System.out.println("Roti dedo bhaiya!");
    }

//    public String makeSound(){
//        return "";
//    }
}
