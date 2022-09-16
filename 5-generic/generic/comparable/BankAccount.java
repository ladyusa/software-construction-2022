package generic.comparable;

public class BankAccount implements Comparable<BankAccount> {
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
    public int compareTo(BankAccount other) {
        if (this.balance < other.balance) return -1;
        if (this.balance > other.balance) return 1;
        return 0; // this.balance == other.balance
    }
}
