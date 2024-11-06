package BackendLLD2.SOLID.V5;

public class Eagle extends Bird implements Flyable {
    private HighFlying highFlying = new HighFlying();
    @Override
    public void fly() {
//        System.out.println("Flying High");
        highFlying.flyNAAAAA();
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is vibing!");
    }
}
