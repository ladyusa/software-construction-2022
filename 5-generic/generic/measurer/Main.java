package generic.measurer;

public class Main {

    public static void main(String[] args) {
        Country[] countries = new Country[3];
        countries[0] = new Country("Thailand", 500, 70);
        countries[1] = new Country("Singapore", 0.7, 5);
        countries[2] = new Country("Japan", 377, 125);

        PopulationMeasurer popMeasurer = new PopulationMeasurer();
        double avgPop = Data.average(countries, popMeasurer);
        System.out.println("Average pop = " + avgPop);

        double avgArea = Data.average(countries, new AreaMeasurer());
        System.out.println("Average area = " + avgArea);

        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(100);
        accounts[1] = new BankAccount(200);
        accounts[2] = new BankAccount(300);

        double avgBalance = Data.average(accounts, new BalanceMeasurer());
        System.out.println("Average balance = " + avgBalance);

        // ถ้าพยายามใช้ array ของ Country กับ BalanceMeasurer ที่รับแต่ BankAccount
        // จะเกิด compile error เลย ซึ่งทำให้โปรแกรมปลอดภัยมากขึ้น
        // double average = Data.average(countries, new BalanceMeasurer());

    }
}
