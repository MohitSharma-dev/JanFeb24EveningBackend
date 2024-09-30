package Interfaces.V1;

public class YesBankAPI implements BankAPI{

    public int balanceCheck(String account) {
        System.out.println("Getting Balance via YesBank");
        return 100;
    }

}
