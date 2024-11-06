package BackendLLD2.SOLID.V7DependencyInjection;

public class Sparrow extends Bird implements Flyable {
    private FlyingBehaviour fb = new LowFlying();
    @Override
    public void fly() {
//       lowFlying.doFlying();
        fb.doFlying();
    }

    @Override
    public void makeSound() {
        System.out.println("Gutr Gutr");
    }
}
