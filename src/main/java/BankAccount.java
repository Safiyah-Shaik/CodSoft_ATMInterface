
import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double checkBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive.");
            return false;
        }

        balance += amount;
        System.out.println("Deposit successful!");
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return false;
        }

        if (amount > balance) {
            System.out.println("Error: Insufficient balance.");
            return false;
        }

        balance -= amount;
        System.out.println("Withdrawal successful!");
        return true;
    }
}
