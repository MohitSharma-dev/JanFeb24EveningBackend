package BackendLLD2.SOLID.V6;

public class Eagle extends Bird implements Flyable {
    private FlyingBehaviour fb = new HighFlying();
    @Override
    public void fly() {
//        System.out.println("Flying High");
//        highFlying.flyNAAAAA();
        fb.doFlying();
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is vibing!");
    }
}
