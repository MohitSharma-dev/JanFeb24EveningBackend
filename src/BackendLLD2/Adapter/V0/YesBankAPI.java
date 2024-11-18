package BackendLLD2.Adapter.V0;

public class YesBankAPI implements BankAPI {

    public int balanceCheck(String account) {
        System.out.println("Getting Balance via YesBank");
        return 100;
    }

}
