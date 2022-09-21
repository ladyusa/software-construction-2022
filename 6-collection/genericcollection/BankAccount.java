package genericcollection;

import java.io.Serializable;

// BankAccount is measurable --- IS-A relationship
public class BankAccount implements Measurable, Serializable, Comparable<BankAccount> {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }


    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

    public double getMeasure() {
        return balance;
    }

    public int compareTo(BankAccount other) {
        if (this.balance < other.balance) return -1;
        if (this.balance > other.balance) return 1;
        return 0;
    }
}












