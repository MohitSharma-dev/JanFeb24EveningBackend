package BackendLLD2.Decorator.BeverageDecorator;

public class Milk extends Addon{
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 25 + beverage.cost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.print(" Added Milk");
    }
}
