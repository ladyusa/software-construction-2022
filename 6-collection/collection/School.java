package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class School {

    private Map<String, Student> studentMap;

    public School() {
        studentMap = new HashMap();
    }

    public Student findStudent(String name) {
//        for (Student s : studentMap) {
//            if (s.getName().equals(name))
//                return s;
//        }
//        return null;

        return studentMap.get(name);
    }

    public void register(Student student) {
//        list.add(student);
        studentMap.put(student.getName(), student);
    }
}
