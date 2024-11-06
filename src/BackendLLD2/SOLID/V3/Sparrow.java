package BackendLLD2.SOLID.V3;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying Low");
    }

    @Override
    public void makeSound() {
        System.out.println("Gutr Gutr");
    }
}
