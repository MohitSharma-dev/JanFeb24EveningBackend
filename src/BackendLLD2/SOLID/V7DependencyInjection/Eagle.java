package BackendLLD2.SOLID.V7DependencyInjection;

public class Eagle extends Bird implements Flyable {
    private FlyingBehaviour fb;

    Eagle(){
        this.fb = new HighFlying();
    }

    Eagle(FlyingBehaviour fb){
        this.fb = fb;
    }

    public void setFb(FlyingBehaviour fb) {
        this.fb = fb;
    }

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
