package Interfaces.V1;

public class ICICIBankAPI implements BankAPI{

    public int balanceCheck(String account){
        System.out.println("getting balance via ICICI");
        return 100;
    }
}

// We can use Interface as a type
// Animal x = new Dog();
// Interface y = new ClasswhichImplementsThisInterface;

// BankAPI x = new YesBank();