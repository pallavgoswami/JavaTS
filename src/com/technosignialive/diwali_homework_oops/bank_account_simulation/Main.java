package com.technosignialive.diwali_homework_oops.bank_account_simulation;

public class Main {
    public static void main(String[] args) {
        // New bank account creation
        BankAccount account = new BankAccount(123456789, "John Doe", 1000.0);

        // Display account details
        account.displayAccountDetails();

        // Deposit money
        account.depositMoney(500.0);

        // Withdraw money
        account.withdraw(300.0);
        account.displayAccountDetails();

        // Withdraw more than available balance
        account.withdraw(1500.0);
        account.displayAccountDetails();
    }
}
