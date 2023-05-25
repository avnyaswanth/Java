package main.sample;

public class Cat extends Animal {
    String food;

    public Cat() {
        super();
    }

    public Cat(int age, String name, String food) {
        super(age, name);
        this.food = food;
    }
    public void makeNoise() {
        super.makeNoise();
        System.out.println("meow meow !!!");
    }

    public void eat() {
        super.eat();
        System.out.println("Eat " + this.food);
    }
}
