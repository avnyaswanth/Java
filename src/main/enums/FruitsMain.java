package main.enums;

import main.enums.Fruits;

import java.util.Scanner;

public class FruitsMain {
    public static void main(String[] args) {
        Fruits[] fruits = Fruits.values();
        Fruits grape = Fruits.GRAPES;
        System.out.println(grape);

        String age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextLine();

        for(Fruits fruit : fruits) {
            System.out.print(fruit);
            System.out.println(" , Can person eat ? :  " + fruit.checkCanEat(Integer.parseInt(age)));
        }

        System.out.println("\nGet the taste to price ratios for fruits");
        for(Fruits fruit : fruits) {
            System.out.println(fruit.name() + " " + fruit.getTasteToPriceRatio());
        }
    }
}
