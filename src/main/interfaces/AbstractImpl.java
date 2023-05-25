package main.interfaces;

public class AbstractImpl extends AbstractDemo{

    public static int x = 10;

    @Override
    public void doSomething() {
        System.out.println("Do something");
    }

    public void eatSomething() {
        System.out.println("Eat some");
    }
}
