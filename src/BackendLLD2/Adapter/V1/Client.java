package BackendLLD2.Adapter.V1;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bankName =  scanner.nextLine();

        BankAPI bankAPI = BankAPIAdapterFactory.getBankAPIAdapter(bankName);
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.rechargeFastTag(120);
    }
}


// Phone Pe : fast , loan