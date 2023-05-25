package main.interfaces;

public interface Vehicle {

    public void doNothing();

    default void numberOfWheels() {
        System.out.println("4");
    }

    default void engineName() {
        doSomething();
        System.out.println("Ev enginge");
    }

    public static void noOfSeats() {
        System.out.println("10 + D");
    }

    private void doSomething() {
        System.out.println("Do something");
    }

    public static void speed() {
        System.out.println("100kmph");
    }
}

// multiple static and default methods can be allowed in an interface.

