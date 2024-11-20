package BackendLLD2.Decorator.BeverageDecorator;

public class Mocha extends Addon {
    private Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.print(" Added Mocha");
    }
}
