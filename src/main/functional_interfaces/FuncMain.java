package main.functional_interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FuncMain {
    public static void main(String[] args) {
        String[] lst = implementSupplier();
        Stream.of(lst).filter(implementPredicate()).map(implementFunction()).forEach(implementConsumer());
    }

    public static Function<String, Pair> implementFunction() {
        Function<String, Pair> function = x -> new Pair(x, x.length());
        return function;
    }

    public static Consumer<Pair> implementConsumer() {
        Consumer<Pair> consumer = x -> System.out.println(x);
        return consumer;
    }

    public static String[] implementSupplier() {
        Supplier<String[]> supplier = () -> {
            return new String[]{"dinesh", "jared", "richard", "urlich","bachmann","pi","jian yang", "gillfoyle"};
        };

        return supplier.get();
    }

    public static Predicate<String> implementPredicate() {
        Predicate<String> predicate = x -> x.length() > 6;
        return predicate;
    }
}

class Pair {
    String name;
    int len;

    public Pair(String name, int len) {
        this.name = name;
        this.len = len;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "name='" + name + '\'' +
                ", len=" + len +
                '}';
    }
}
