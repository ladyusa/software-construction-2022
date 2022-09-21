package genericcollection;

import collection.Bank;

import java.util.ArrayList;

public class MainAverageGeneric {

    public static void main(String[] args) {

        ArrayList<BankAccount> accountArrayList = new ArrayList<>();
        accountArrayList.add(new BankAccount(100));
        accountArrayList.add(new BankAccount(200));
        accountArrayList.add(new BankAccount(300));

        double balanceAvg = Data.average(accountArrayList);
        System.out.println("Average Balance = " + balanceAvg);

        ArrayList<Country> countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Thailand", 50));
        countryArrayList.add(new Country("UK", 60));
        countryArrayList.add(new Country("Mexico", 80));

        double areaAvg = Data.average(countryArrayList);
        System.out.println("Average Area = " + areaAvg);

    }
}
