package main.strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Yaswanth");
        System.out.println(sbf);
    }

    // methods are synchronised
    // at a time only one thread can access the string buffer object
    // thread saftey
    // slow performance
}
