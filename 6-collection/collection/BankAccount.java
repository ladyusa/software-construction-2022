package collection;

import java.util.Objects;

public class BankAccount {

    private double balance;
    private String name;

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

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

//    public boolean equals(Object o) {
//        BankAccount b = (BankAccount) o;
//        if (this.balance == b.balance)
//            return true;
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.balance, balance) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, name);
    }
}
