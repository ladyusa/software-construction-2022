package generic.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Country[] countries = new Country[3];
        countries[0] = new Country("Thailand", 500, 70);
        countries[1] = new Country("Singapore", 0.7, 5);
        countries[2] = new Country("Japan", 377, 125);

        System.out.println("---- sort by pop ----");
        Arrays.sort(countries, new PopulationComparator());
        for (Country country : countries)
            System.out.println(country);

        System.out.println("---- sort by area ----");
        Arrays.sort(countries, new AreaComparator());
        for (Country country : countries)
            System.out.println(country);

        System.out.println("---- sort by name ----");
        Arrays.sort(countries, new Comparator<Country>() {  // anonymous class (คลาสที่ไม่มีชื่อ)
            @Override
            public int compare(Country c1, Country c2) {
                return c1.getName().compareTo(c2.getName());
            }
        });

        for (Country country : countries)
            System.out.println(country);

        Arrays.sort(countries, new Comparator<Country>() {

            @Override
            public int compare(Country c1, Country c2) {
                if (c1.getPopulation()/c1.getArea() < c1.getPopulation()/c1.getArea())
                    return -1;
                if (c1.getPopulation()/c1.getArea() > c1.getPopulation()/c1.getArea())
                    return 1;
                return 0;
            }
        });
        System.out.println("---- sort by density -----");
        for (Country country : countries)
            System.out.println(country);

        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(500);
        accounts[1] = new BankAccount(800);
        accounts[2] = new BankAccount(300);


        System.out.println("----- sort by balance ----");
        Arrays.sort(accounts, new BalanceComparator());
        for (BankAccount account : accounts)
            System.out.println(account.getBalance());
    }

    static class BalanceComparator implements Comparator<BankAccount> {

        @Override
        public int compare(BankAccount b1, BankAccount b2) {
            if (b1.getBalance() < b2.getBalance()) return -1;
            if (b1.getBalance() > b2.getBalance()) return 1;
            return 0;
        }
    }
}
