package exception;

public class Main {

    public static void main(String[] args)  {

        BankAccount account = new BankAccount(1000);

        System.out.println(account);

        account.deposit(500);
        System.out.println(account);

        try {
            System.out.println(1);
            account.withdraw(100000);
            System.out.println(2);
        } catch (NotEnoughMoneyException e) {
            System.out.println(3);
            System.err.println();
        }
        System.out.println(4);

    }
}
