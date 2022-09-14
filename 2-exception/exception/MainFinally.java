package exception;

public class MainFinally {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(50000);
            System.out.println("Withdraw successful");
        }
        catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        finally {
            System.out.println("Hello");
        }
    }
}
