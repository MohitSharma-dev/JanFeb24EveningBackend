package Polymorphism.MethodOverriding;

public class Client {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Dog d = new Dog();
//        Method overriding
        d.makeSound();

        Animal x = new Dog();
        x.makeSound();
//        the below code won't work
//        x.eat();
//        compiler , Run time
    }
}
