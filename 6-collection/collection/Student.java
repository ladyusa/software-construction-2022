package collection;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int year;

    public Student(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.year - o.year;
    }
}
