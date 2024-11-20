package BackendLLD2.Decorator.BeverageDecorator;

import java.util.List;

public abstract class Beverage {
    private List<Addon> addons;


    public abstract double cost();
    public void getDescription(){
        System.out.println("Beverage Description : ");
    }
}
