package collection;

import java.util.HashMap;

public class MainMap {

    public static void main(String[] args) {

        HashMap<String, BankAccount> accountMap = new HashMap<>();
        BankAccount act1 = new BankAccount(100);
        BankAccount act2 = new BankAccount(200);
        BankAccount act3 = new BankAccount(300);

        accountMap.put("Kwan", act1);
        accountMap.put("Ploy", act2);
        accountMap.put("Fon", act3);

        System.out.println(   accountMap.containsKey("Kwan") );
        System.out.println(   accountMap.containsKey("Usa") );
        System.out.println(   accountMap.containsValue(act1));
        System.out.println(   accountMap.containsValue(new BankAccount(400)));

        BankAccount b = accountMap.get("Kwan");
        System.out.println(b);
    }

}
