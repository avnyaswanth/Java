package main.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ComparatorMain {
    public static void main(String[] args) {
        Student s1 = new Student("alpha", 123, 'a');
        Student s2 = new Student("beta", 234, 'b');
        Student s3 = new Student("gamma", 435, 'a');
        Student s4 = new Student("sigma", 243, 'b');
        Student s5 = new Student("delta", 462, 'c');
        Student[] studs = new Student[]{s1, s2, s3, s4, s5};

        // sort by name by using comparable interface

//        Arrays.sort(studs);
//        Stream.of(studs).forEach(System.out::println);
//        System.out.println();

        // sort by name  -> anonymous class implementation
//        Comparator<Student> sortByStudName = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };

        // lambda implementation
        Comparator<Student> sortByStudName = (x, y) -> {
            return x.getName().compareTo(y.getName());
        };

//        SortByStudName sortByStudName = new SortByStudName();

        Arrays.sort(studs, sortByStudName);
        Stream.of(studs).forEach(System.out::println);
        System.out.println();

        // sort by id descending order
        SortByStudId sortByStudId = new SortByStudId();
        Arrays.sort(studs, sortByStudId);
        Stream.of(studs).forEach(System.out::println);
    }
}
