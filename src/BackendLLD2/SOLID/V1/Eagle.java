package BackendLLD2.SOLID.V1;

public class Eagle extends Bird{

    @Override
    public void fly() {
        System.out.println("Flying High");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is vibing!");
    }
}
