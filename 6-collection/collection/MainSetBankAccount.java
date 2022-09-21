package collection;

import java.util.*;

public class MainSetBankAccount {

    public static void main(String[] args) {
        System.out.println("-------- ArrayList --------");
        ArrayList<BankAccount> list = new ArrayList<>();
        BankAccount b1 = new BankAccount(1000);
        BankAccount b2 = new BankAccount(250);
        BankAccount b3 = new BankAccount(880);

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b1);

        for (BankAccount b : list)
            System.out.println(b);

        System.out.println("-------- Hash Set --------");
        HashSet<BankAccount> hashSet = new HashSet<>();
        hashSet.add(b1);
        hashSet.add(b2);
        hashSet.add(b3);
        hashSet.add(b1);

        for (BankAccount b : hashSet)
            System.out.println(b);

        System.out.println("-------- Tree Set --------");
        TreeSet<BankAccount> treeSet = new TreeSet<>(new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                if (o1.getBalance() < o2.getBalance()) return -1;
                if (o1.getBalance() > o2.getBalance()) return 1;
                return 0;
            }
        });
        treeSet.add(b1);
        treeSet.add(b2);
        treeSet.add(b3);
        treeSet.add(b1);

        for (BankAccount b : treeSet)
            System.out.println(b);
    }
}
