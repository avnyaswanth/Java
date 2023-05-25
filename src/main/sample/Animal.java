package main.sample;

public class Animal {
    int age;
    String name;

    public Animal() { }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Do some random noise");
    }

    public void eat() {
        System.out.println("Eat something");
    }
}
