package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Bank {
    private List<BankAccount> accountList;

    public Bank() {
        accountList = new ArrayList<>();
    }

    public Bank(LinkedList<BankAccount> list) {
        accountList = list;
    }

    public Bank(Vector<BankAccount> list) {
        accountList = list;
    }
}
