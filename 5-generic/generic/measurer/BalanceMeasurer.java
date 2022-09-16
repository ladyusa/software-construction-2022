package generic.measurer;

public class BalanceMeasurer implements Measurer<BankAccount> {
    @Override
    public double measure(BankAccount account) {
        return account.getBalance();
    }
}
