package exception;

import java.io.IOException;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) throws NotEnoughMoneyException {

        System.out.println("before throw exception statement");

        if (amount <= 0)
            throw new IllegalArgumentException("amount must be positive");

        if (balance < amount)
            throw new NotEnoughMoneyException("Cannot withdraw more than balance");

        System.out.println("after throw exception statement");

        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
