package collection;

import java.util.HashMap;
import java.util.TreeMap;

public class MainMapStudent {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Kwan", 1);
        Student student2 = new Student(2, "Ploy", 4);
        Student student3 = new Student(3, "Fon", 2);

        System.out.println("--------- hash map ----------");
        HashMap<String,Student> maps = new HashMap<>();
        maps.put("Kwan", student1);
        maps.put("Ploy", student2);
        maps.put("Fon", student3);

        for (Student student : maps.values()) {
            System.out.println(student);
        }

        System.out.println("--------- tree map ----------");
        TreeMap<String,Student> treeMap = new TreeMap<>();
        treeMap.put("Kwan", student1);
        treeMap.put("Ploy", student2);
        treeMap.put("Fon", student3);

        for (Student student : treeMap.values()) {
            System.out.println(student);
        }

//        System.out.println(   maps.get("Ploy")   );
//        System.out.println(   maps.get("Usa")   );
//
//        School school = new School();
//        school.register(student1);
//        school.register(student2);
//
//        System.out.println(   school.findStudent("Kwan")  );
    }
}
