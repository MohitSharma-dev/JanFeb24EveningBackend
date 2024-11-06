package BackendLLD2.SOLID.V5;

public class Penguin extends Bird {
    @Override
    public void makeSound() {
        System.out.println("I am cute! I don't have produce sounds to be interesting");
    }
//    Penguins don't fly
//    @Override
//    public void fly() {
////         leave it empty
////        throw exception
//    }
}
