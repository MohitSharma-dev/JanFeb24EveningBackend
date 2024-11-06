package BackendLLD2.SOLID.V2;

public class Sparrow extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Flying Low");
    }

    @Override
    public void makeSound() {
        System.out.println("Gutr Gutr");
    }
}
