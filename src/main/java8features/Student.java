package main.java8features;

public class Student implements Comparable<Student> {
    String name;
    int id;
    char section;

    public Student() {}

    public Student(String name, int id, char section) {
        this.name = name;
        this.id = id;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", section=" + section +
                '}';
    }
}
