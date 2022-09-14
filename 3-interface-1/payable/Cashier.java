package payable;

public class Cashier {

    public void receive(Payable payable, double amount) {
        payable.pay(amount);
    }
}
