package main.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceMain {
    public static void main(String[] args) {
        Person p1 = new Person("yaswanth", 18);
        Person p2 = new Person("alapati", 19);
        Person p3 = new Person("beta", 17);
        Person p4 = new Person("gamma", 23);
        Person p5 = new Person("sigma", 15);
        Person p6 = new Person("delta", 12);
        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);
        List<String> eligibleVoters = null;

        List<String> names = persons.stream().map(Person::getName).collect(Collectors.toList());

        eligibleVoters = persons.stream()
                .filter(Person::isEligibleToVote)
                .map(Person::getName)
                .collect(Collectors.toList());

        AgeComparator ageComparator = new AgeComparator();

        System.out.println(eligibleVoters);

        System.out.println("Sort by age : " +  persons.stream().sorted(AgeComparator::compareAge).collect(Collectors.toList()));
        System.out.println("Sort by name : " + persons.stream().sorted(ageComparator::nameSizeComparator).collect(Collectors.toList()));
        System.out.println("Sort by names : " + names.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList()));
    }
}
