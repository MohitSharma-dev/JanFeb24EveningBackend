package BackendLLD2.Adapter.V1;

public class YesBankAPIAdapter implements BankAPI {
    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public int balanceCheck(String accountNumber) {
        return yesBankAPI.getBalance(accountNumber);
    }

//    all other functions will also be implemented
}
