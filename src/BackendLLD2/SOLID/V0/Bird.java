package BackendLLD2.SOLID.V0;

public class Bird {
    private String name;
    private String type;
    int noOfWings;
    boolean canFly;

    public Bird(){

    }

    public Bird(String name, String type, int noOfWings, boolean canFly) {
        this.name = name;
        this.type = type;
        this.noOfWings = noOfWings;
        this.canFly = canFly;
    }

    public void eat(){
        System.out.println("Bird is eating");
    }

    public void fly(){

    }

    public void makeSound(){
        if(type.equals("Sparrow")){
            System.out.println("gutr gutr");
        } else if (type.equals("Crow")){
            System.out.println("kaow kaow");
        }
    }
}
