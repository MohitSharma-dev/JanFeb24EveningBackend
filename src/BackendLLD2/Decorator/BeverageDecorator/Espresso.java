package BackendLLD2.Decorator.BeverageDecorator;

public class Espresso extends Beverage{

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.print("Espresso ");
    }

    @Override
    public double cost() {
        return 100;
    }
}
