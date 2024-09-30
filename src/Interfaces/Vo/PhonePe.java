package Interfaces.Vo;

public class PhonePe {
    private YesBankAPI yesBankAPI;
    private FastTagRecharge fastTagRecharge;
    private PhonePeLoan phonePeLoan;

    PhonePe(){
        yesBankAPI = new YesBankAPI();
        fastTagRecharge = new FastTagRecharge();
        phonePeLoan = new PhonePeLoan();
    }

    boolean rechargeFastTag(int amount){
        return fastTagRecharge.recharge(yesBankAPI , amount);
    }

    boolean availLoan(int amount){
        return phonePeLoan.checkEligibility(yesBankAPI , amount);
    }
}
