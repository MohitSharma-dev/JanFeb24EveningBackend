package BackendLLD2.Decorator.BeverageDecorator;

public class Whip extends Addon{
    private Beverage currentBeverage;

    Whip(Beverage currentBeverage) {
        this.currentBeverage = currentBeverage;
    }
    @Override
    public double cost() {
        return 10 + currentBeverage.cost();
    }

    @Override
    public void getDescription() {
        currentBeverage.getDescription();
        System.out.print(" Added Whip");
    }
}
