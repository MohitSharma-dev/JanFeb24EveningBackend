package Interfaces.Vo;

public class FastTagRecharge {

    boolean recharge(YesBankAPI yesBankAPI, int amount){
        if(amount <= yesBankAPI.getBalance("")){
            System.out.println("Recharge is successful");
            return true;
        }
        return false;
    }
}
