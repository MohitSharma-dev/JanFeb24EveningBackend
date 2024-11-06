package BackendLLD2.SOLID.V1;

public class Sparrow extends Bird{
    @Override
    public void fly() {
        System.out.println("Flying Low");
    }

    @Override
    public void makeSound() {
        System.out.println("Gutr Gutr");
    }
}
