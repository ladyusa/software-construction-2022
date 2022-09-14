package measurable;

public class MainMeasurable {

    public static void main(String[] args) {

        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(100);
        accounts[1] = new BankAccount(200);
        accounts[2] = new BankAccount(300);

        double avgBalance = Data.average(accounts);
        System.out.println("Average balance = " + avgBalance);

        Country[] countries = new Country[3];
        countries[0] = new Country("Thailand", 500, 70);
        countries[1] = new Country("Singapore", 0.7, 5);
        countries[2] = new Country("Japan", 377, 125);

        double avgArea = Data.average(countries);
        System.out.println("Average area = " + avgArea);

    }
}
