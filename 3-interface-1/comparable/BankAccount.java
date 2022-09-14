package comparable;

import measurable.Measurable;

public class BankAccount implements Measurable, Comparable {
    private double balance;

    public BankAccount() {
        this(0);
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public double getMeasure() {
        return balance;
    }

    @Override
    public int compareTo(Object o) {
        BankAccount other = (BankAccount) o;
        if (this.balance < other.balance) return -1;
        if (this.balance > other.balance) return 1;
        return 0; // this.balance == other.balance
    }
}
