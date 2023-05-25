package main.interfaces;

public class InterfaceMain {
    public static void main(String[] args) {
        VehicleImpl vehicle = new VehicleImpl();
        Vehicle vehicle1 = new VehicleImpl();
        vehicle.doNothing();
        vehicle.numberOfWheels();
        Vehicle.speed();    // static methods must be called with the interface name only.
                            // can't cl static methods with cls names implnting interface

        AbstractDemo abstractDemo = new AbstractImpl();
        abstractDemo.doSomething();
    }
}
