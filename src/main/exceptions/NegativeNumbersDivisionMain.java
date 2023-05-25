package main.exceptions;

import java.util.Scanner;

public class NegativeNumbersDivisionMain {
    public static void main(String[] args) {

        int numerator, denominator;
        Scanner input = new Scanner(System.in);
        numerator = input.nextInt();
        denominator = input.nextInt();
        try {
            if(denominator < 0){
//                throw new CustomerNegativeDivisionException();
//                throw new CustomerNegativeDivisionException("Negative denominator");
                  throw new CustomerNegativeDivisionException("Negative denominator", numerator, denominator);
            }
            if(denominator == 0)
                throw new ArithmeticException("Denominator is Zero");
            System.out.println(numerator/denominator);

        } catch (CustomerNegativeDivisionException ex) {
            System.out.println("CustomerNegativeDivisionException - Message : " + ex.getMessage() + " " + ex.getNumerator() + " " + ex.getDenominator());
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException - Message : " + ex.getMessage());
        } finally {
            System.out.println("inside finally");
        }
        System.out.println("end of the main");
    }
}
