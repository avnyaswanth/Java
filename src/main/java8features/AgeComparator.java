package main.java8features;

public class AgeComparator {
    public static int compareAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }

    public int nameSizeComparator(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}
