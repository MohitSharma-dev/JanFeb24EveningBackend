package BackendLLD2.Factory.Platforms.Button;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("AndroidButton clicked");
    }
}
