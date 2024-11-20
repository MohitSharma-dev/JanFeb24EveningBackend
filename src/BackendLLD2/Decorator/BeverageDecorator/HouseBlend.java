package BackendLLD2.Decorator.BeverageDecorator;

public class HouseBlend extends Beverage {
    @Override
    public void getDescription() {
        System.out.println("House Blend");
    }

    @Override
    public double cost() {
        return 150;
    }
}
