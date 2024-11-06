package BackendLLD2.SOLID.V5;

public class Sparrow extends Bird implements Flyable {
    private LowFlying lowFlying = new LowFlying();
    @Override
    public void fly() {
       lowFlying.doFlying();
    }

    @Override
    public void makeSound() {
        System.out.println("Gutr Gutr");
    }
}
