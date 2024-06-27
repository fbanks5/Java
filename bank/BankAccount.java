package bank;

public class BankAccount {
        public int accountNumber;
        public String accountHolder;
        public double balance;


        public void deposit(double amount) {
            balance = balance + amount;
        }

        public void withdraw(double amount) {
            balance = balance - amount;
        }

        public double calculateCreditWorthiness() {
            // implementation
            return 100;
        }

        public double getAcountNumber() {
            return accountNumber;
        }

        public double setAcountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
            return 0;
        }

        public String getAccountHolder() {
            this.accountHolder = accountHolder;
            return accountHolder;
        }

        public String setAccountHolder(String accountHolder) {
            this.accountHolder = accountHolder;
            return accountHolder;
        }
    }

