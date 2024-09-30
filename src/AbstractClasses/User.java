package AbstractClasses;

import Interfaces.V1.BankAPI;

public abstract class User{
    private String name;
    private String email;
    private String password;

    public void login(){
        System.out.println("User successfully logged in");
    }

    public abstract void addProfile();
}
