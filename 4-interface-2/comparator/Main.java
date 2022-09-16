package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        // nested class ภายในเมธอด ใช้ได้แค่ในเมธอด main() นี้เท่านั้น
        class AreaComparator implements Comparator {
            @Override
            public int compare(Object o1, Object o2) {
                Country c1 = (Country) o1;
                Country c2 = (Country) o2;
                if (c1.getArea() < c2.getArea()) return  -1;
                if (c1.getArea() > c2.getArea()) return  1;
                return 0;
            }
        }

        Country[] countries = new Country[3];
        countries[0] = new Country("Thailand", 500, 70);
        countries[1] = new Country("Singapore", 0.7, 5);
        countries[2] = new Country("Japan", 377, 125);

        System.out.println("---- sort by population ----");
        Arrays.sort(countries, new PopulationComparator());
        for (Country country : countries)
            System.out.println(country);

        System.out.println("---- sort by area ----");
        Arrays.sort(countries, new AreaComparator());
        for (Country country : countries)
            System.out.println(country);

        System.out.println("---- sort by name ----");
        Arrays.sort(countries, new Comparator() {
            // anonymous class (คลาสที่ไม่มีชื่อ)
            // นิยามเมธอดของ interface และนำมาใช้เลย
            // ใช้ได้แค่ในเมธอด sort() ในบรรทัดที่ 40 นี้เท่านั้น

            @Override
            public int compare(Object o1, Object o2) {
                Country c1 = (Country) o1;
                Country c2 = (Country) o2;
                return c1.getName().compareTo(c2.getName());
            }
        });
        for (Country country : countries)
            System.out.println(country);

        System.out.println("---- sort by density ----");
        Arrays.sort(countries, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Country c1 = (Country) o1;
                Country c2 = (Country) o2;
                if (c1.getPopulation()/c1.getArea() < c1.getPopulation()/c1.getArea())
                    return -1;
                if (c1.getPopulation()/c1.getArea() > c1.getPopulation()/c1.getArea())
                    return 1;
                return 0;
            }
        });
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

    // nested class นิยามคลาสภายในคลาส ใช้ได้ในทุกเมธอดในคลาสนี้
    static class BalanceComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            BankAccount b1 = (BankAccount) o1;
            BankAccount b2 = (BankAccount) o2;
            if (b1.getBalance() < b2.getBalance()) return -1;
            if (b1.getBalance() > b2.getBalance()) return 1;
            return 0;
        }
    }
}
