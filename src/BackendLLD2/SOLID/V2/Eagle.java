package BackendLLD2.SOLID.V2;

public class Eagle extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("Flying High");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is vibing!");
    }
}
