package main.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMain {
    public static void main(String[] args) {

        // reduce
        IntStream.range(1, 10)
                .reduce((a, b) -> a + b).ifPresent(System.out::println);

        System.out.println(IntStream.range(2, 5)
                .reduce(10, (a, b) -> a + b));

        String[] names = {"rani", "raji", "hacker", "srinu", "vijaya", "shiva",
                          "aravind", "terlin", "kishore", "murari", "pavan", "hemanth",
                          "david", "minni", "cherry", "deepak", "govardhan"};

        // filtering names length greater than 5 in sorted order
        List<String> filteredNames;
        filteredNames = Arrays.stream(names).sorted().filter(name -> name.length() > 5).collect(Collectors.toList());
        filteredNames.forEach(name -> System.out.println(name + " "));

        // counting the names greater than 5 chars
        int count = (int)Arrays.stream(names).filter(name -> name.length() > 5).count();
        System.out.println(count);

        // filtering names in sorted order and converting all into uppercase
        filteredNames = Arrays.stream(names).sorted().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(filteredNames);

        // filtering names whose with starting letter M
        filteredNames = Arrays.stream(names).sorted().filter(name -> name.startsWith("m")).collect(Collectors.toList());
        System.out.println(filteredNames);

        // concatenation of sorted names starting with letter h
        Optional<String> result = Arrays.stream(names).sorted().filter(name -> name.startsWith("h")).reduce(((first, second) -> first + " " +  second));
        System.out.println(result.get());

        // average of squares of doubles
        Arrays.stream(new double[]{1.0, 2.0, 3.0, 4.0}).map(num -> num * num).average().ifPresent(System.out::println);

        // mapping string to their length using streams
        System.out.println("Name and Length : ");
        Map<String, Integer> namesMap = new HashMap<>();
        namesMap = Stream.of(names).collect(Collectors.toMap(x -> x, x -> x.length()));
        for(Map.Entry<String, Integer> entry : namesMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
//        namesMap.forEach((key, value) -> System.out.println(key + " " + value));


        // sort by length of the names
        Stream.of(names).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        }).collect(Collectors.toList()).forEach(System.out::println);

    }
}
