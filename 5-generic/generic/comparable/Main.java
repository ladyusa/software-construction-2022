package generic.comparable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(500);
        accounts[1] = new BankAccount(800);
        accounts[2] = new BankAccount(300);

        for (BankAccount account : accounts)
            System.out.println(account.getBalance());

        Arrays.sort(accounts);

        System.out.println("---- after sort ----");
        for (BankAccount account : accounts)
            System.out.println(account.getBalance());

        Country[] countries = new Country[3];
        countries[0] = new Country("Thailand", 500, 70);
        countries[1] = new Country("Singapore", 0.7, 5);
        countries[2] = new Country("Japan", 377, 125);

        Arrays.sort(countries);

        System.out.println("---- after sort country ----");
        for (Country country : countries)
            System.out.println(country.getArea());
    }
}
