package main.optionals;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {

        Optional<Cat> cat = getCatByName("Snow Bell");
        if(cat.isPresent())
            System.out.println(cat.get());

        else System.out.println("No such cat is present in the database");
        System.out.println(cat.orElse(new Cat("default cat", 0)));  // if cat is not null then we get cat else
                                                                               // we get cat inside orElse() method.

    }

    public static Optional<Cat> getCatByName(String name) {
        Cat cat = new Cat(name, name.length());
        return Optional.ofNullable(cat);    // if the object can be null then use ofNullable() else of() method on obj
    }
}
