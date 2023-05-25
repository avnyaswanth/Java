package main.exceptions;

public class CustomerNegativeDivisionException extends RuntimeException {
    private String message;
    private int numerator;
    private int denominator;

    CustomerNegativeDivisionException() {
        super();
    }

    CustomerNegativeDivisionException(String message) {
        super(message);
        this.message = message;
    }

    CustomerNegativeDivisionException(String message, int numerator, int denominator) {
        super(message);
        this.message = message;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
