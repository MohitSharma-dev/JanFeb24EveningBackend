package BackendLLD2.SOLID.V3;

public class Eagle extends Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Flying High");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is vibing!");
    }
}
