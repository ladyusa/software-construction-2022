package collection;

import java.util.ArrayList;
import java.util.List;

public class MainList {

    public static void main(String[] args) {
        List<BankAccount> list = new ArrayList<>();
        BankAccount b1 = new BankAccount(100);
        BankAccount b2 = new BankAccount(200);
        BankAccount b3 = new BankAccount(300);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        BankAccount b = list.get(0);

        System.out.println("list.contains(b1)? " + list.contains(b1) );
        System.out.println("list.contains(new BankAccount(100))? " + list.contains(new BankAccount(100)) );

        BankAccount b11 = new BankAccount(100);

        System.out.println("b1 == b1 ? " + (b1 == b1) );
        System.out.println("b1 == b11 ? " + (b1 == b11) );
        System.out.println("b1.equals(b1) ? " +  b1.equals(b1) );
        System.out.println("b1.equals(b11) ? " +  b1.equals(b11) );

    }
}
