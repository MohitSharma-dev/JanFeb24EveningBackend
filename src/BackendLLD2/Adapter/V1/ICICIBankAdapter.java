package BackendLLD2.Adapter.V1;

public class ICICIBankAdapter implements BankAPI{
    private ICICIBankAPI icicibankAPI = new ICICIBankAPI();
    @Override
    public int balanceCheck(String accountNumber) {
        return icicibankAPI.checkBalance(accountNumber);
    }
}
