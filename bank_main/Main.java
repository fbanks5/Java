package bank_main;
import bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 123456;
        account.accountHolder = "John Doe";
        account.balance = 1000.0;

        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Account Holder: " + account.accountHolder);
        System.out.println("Balance: " + account.balance);
    }

}
