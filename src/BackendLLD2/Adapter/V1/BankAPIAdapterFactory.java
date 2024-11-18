package BackendLLD2.Adapter.V1;

public class BankAPIAdapterFactory {
    public static BankAPI getBankAPIAdapter(String bankName){
        BankAPI bankAPI = null;
        if(bankName.equals("ICICI")){
            bankAPI = new ICICIBankAdapter();
        } else if (bankName.equals("Yes")){
            bankAPI = new YesBankAPIAdapter();
        }
        return bankAPI;
    }
}
