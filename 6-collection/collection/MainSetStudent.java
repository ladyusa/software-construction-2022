package collection;

import java.util.TreeSet;

public class MainSetStudent {
    public static void main(String[] args) {
        System.out.println("------- treeSet student -------");

        Student s1 = new Student(1, "Kwan", 3);
        Student s2 = new Student(2, "Ploy", 1);
        Student s3 = new Student(3, "Fon", 2);

        TreeSet<Student> studentSet = new TreeSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s1);

        for (Student s : studentSet)
            System.out.println(s);
    }
}
