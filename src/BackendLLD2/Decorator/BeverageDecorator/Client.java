package BackendLLD2.Decorator.BeverageDecorator;

public class Client {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.cost());

        beverage.getDescription();
        System.out.println();

        beverage =  new Whip(beverage);
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage.getDescription();
        System.out.println();
        System.out.println(beverage.cost());

    }
}
