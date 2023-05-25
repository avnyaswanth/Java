package main.regex.example_ques;

import java.util.Scanner;
import java.util.regex.Pattern;

public class QuestionsRegex {
    public static boolean alphaNumeric(String text) {
//        Write a Java program to check whether a string contains only a certain set of characters (in this case a-z, A-Z and 0-9)
        String pattern = "[a-zA-Z_0-9]";
        return Pattern.matches(pattern, text);
    }

    private static boolean pAndQs(String text) {
//        Write a Java program that matches a string that has a p followed by zero or more q's.
        String pattern = "pq*";
        return Pattern.matches(pattern, text);
    }


    private static boolean lowercaselettersWithUnderscoreJoining(String text) {
//        Write a Java program to find sequences of lowercase letters joined with a underscore
        String pattern = "[a-z]+_[a-z]+";
        return Pattern.matches(pattern, text);
    }

    private static boolean pStaringEndingQ(String text) {
//        Write a Java program that matches a string that has a 'p' followed by anything, ending in 'q'.
        String pattern = "p.*q$";
        return Pattern.matches(pattern, text);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = null, text = null;;
        text = sc.nextLine();
        System.out.println(alphaNumeric(text));
        System.out.println(pAndQs(text));
    }
}
