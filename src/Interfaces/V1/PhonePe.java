package Interfaces.V1;

public class PhonePe {
    private BankAPI bankAPI;
    private FastTagRecharge fastTagRecharge;
    private PhonePeLoan phonePeLoan;

    PhonePe(BankAPI bankAPI){
//        yesBankAPI = new YesBankAPI();
        this.bankAPI = bankAPI;
        fastTagRecharge = new FastTagRecharge();
        phonePeLoan = new PhonePeLoan();
    }

    boolean rechargeFastTag(int amount){
        return fastTagRecharge.recharge(bankAPI , amount);
    }

    boolean availLoan(int amount){
        return phonePeLoan.checkEligibility(bankAPI , amount);
    }
}
