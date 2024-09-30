package Interfaces.V1;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bankName =  scanner.nextLine();
        BankAPI bankAPI = null;
        if(bankName.equals("ICICI")){
            bankAPI = new ICICIBankAPI();
        } else if (bankName.equals("Yes")){
            bankAPI = new YesBankAPI();
        }
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.rechargeFastTag(120);
    }
}


// Phone Pe : fast , loan