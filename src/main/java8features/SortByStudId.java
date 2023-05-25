package main.java8features;

import java.util.Comparator;

public class SortByStudId implements Comparator<Student> {
    // descending order
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getId()-o1.getId();
    }
}
