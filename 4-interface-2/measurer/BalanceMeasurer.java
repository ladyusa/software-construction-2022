package measurer;

public class BalanceMeasurer implements Measurer {
    @Override
    public double measure(Object obj) {
        BankAccount account = (BankAccount) obj;
        return account.getBalance();
    }
}
