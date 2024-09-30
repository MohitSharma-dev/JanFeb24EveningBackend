package AbstractClasses;

import Interfaces.V1.BankAPI;

public class Student extends User implements BankAPI {
    private String batch;
    private final int x1;

    Student(){
        x1 = 10;
    }

    void attendClass(){
        System.out.println("Attending Class");

    }

    @Override
    public void addProfile() {

    }

    @Override
    public int balanceCheck(String accountNumber) {
        return 0;
    }
}
