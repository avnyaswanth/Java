package main.sample;

public class SampleMain {
    public static void increasePrice(Mobile mobile) {
        mobile.setPrice(mobile.getPrice()+1500);
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile("M51", "Samsung", 20000);
        increasePrice(mobile);
        System.out.println(mobile);
    }
}
