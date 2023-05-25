package main.exceptions;

import java.util.Scanner;

public class NestedExceptionHandling {
    public static void main(String[] args) {
        int a, b;

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

        try {
            System.out.println("a/b : " + a/b);
            System.out.println("after the line where exception occured");
        } catch (ArithmeticException ex) {
            try {
                throw new NullPointerException(ex.getMessage() + " Null pointer");
            } catch (NullPointerException nex) {
                System.out.println(nex.getMessage());
            }
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Inside finally");
        }
    }
}
