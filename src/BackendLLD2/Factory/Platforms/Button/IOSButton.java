package BackendLLD2.Factory.Platforms.Button;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("Clicked IOS Button");
    }
}
