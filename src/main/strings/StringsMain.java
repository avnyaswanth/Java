package main.strings;

public class StringsMain {
    public static void main(String[] args) {

        String s1 = new String("Alpha");
        String s2 = new String("Alpha");

        String a1 = "Beta";
        String a2 = "Beta";
        String x = s1;
        s1 = s1.concat(a1);
        System.out.println(s1);
        System.out.println(x == s1);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
    }
}
