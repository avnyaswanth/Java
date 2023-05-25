package main;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        List<Integer> transactions = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int amnt = 0;
        while(amnt != -1) {
            transactions.add(amnt);
            amnt = scanner.nextInt();
        }
        System.out.println(transactions);
        System.out.println("Total amount = " +  transactions.stream().reduce(0, (x, y) -> x + y));
    }
}
