package main.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionMain {
    public static int divideNumbers(int a, int b) {
        int ans = -1;
        try {
            ans = a / b;
            System.out.println("inside dividenumbers try block");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Divide Numbers method " + ex.getMessage());
        } finally {
            System.out.println("divide numbers finally");
        }
        return ans;
    }

    public static int computeDivision(int a, int b) {
        int ans = -1;
        try {
            ans = divideNumbers(a, b);
            System.out.println("inside computedivision try block");
        } catch (ArithmeticException ex) {
            System.out.println("Compute division method " + ex.getMessage());
        } finally {
            System.out.println("compute division finally");
        }
        return ans;
    }
    public static void main(String[] args) throws FileNotFoundException {

//        readFile("myfile.txt");

        int a, b;

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

        try {
            computeDivision(a, b);
            System.out.println("inside main try block");
        } catch (NullPointerException ex) {
            System.out.println("Main method" + ex.getMessage());
        }
        finally {
            System.out.println("Inside main methods finally");
        }

        System.out.println("End of the method");

    }

    public static void readFile(String filename) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filename);
    }

    // even though we use the throws keyword for the method which is expected to throw the exception
    // we have to handle that excpetion somewhere in the methods call where this method is being called
}
