package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSetString {

    public static void main(String[] args) {

        System.out.println("------- arrayList -------");
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Bye");
        list.add("Ohiyo");
        list.add("Hello");

        for (String data : list)
            System.out.println(data);

        System.out.println("------- hashSet -------");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello");
        hashSet.add("Bye");
        hashSet.add("Ohiyo");
        hashSet.add("Hello");

        for (String data : hashSet)
            System.out.println(data);

        System.out.println("------- treeSet -------");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("Bye");
        treeSet.add("Ohiyo");
        treeSet.add("Hello");

        for (String data : treeSet)
            System.out.println(data);

    }
}
