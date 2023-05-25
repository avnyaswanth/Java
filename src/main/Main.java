package main;
import main.exceptions.BadRequestException;
import main.exceptions.ErrorMsg;

import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String pattern = null;
//        String[] texts = {"hacker",
//                        "hack",
//                        "hacker20",
//                        "alpha-beta",
//                        "12345",
//                        "@#$^*",
//                        "",
//                        "father name"
//                        };
//        Scanner sc = new Scanner(System.in);
////        pattern = sc.next();
////        System.out.println(pattern + ", " + text);
//        for(String text : texts) {
//            System.out.println(text + " : " + (Pattern.matches("[^0-9]{5,}", text) == true ? "Matched" : "Not Matched"));
//        }

        String name = null;

        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();
        try {
            while(n > 0) {
                name = scanner.nextLine();
                if(name.length() < 5)
                    throw new BadRequestException("Less than 5 characters", ErrorMsg.LOWER_LENGTH);
                if(name.length() > 10)
                    throw new BadRequestException("More than 10 characters", ErrorMsg.HIGHER_LENGTH);
                if(name.length() == 0 || name == null)
                    throw new BadRequestException("Name can't be empty", ErrorMsg.EMPTY_NAME);
                n--;
            }
        } catch (BadRequestException e) {
            System.out.println(e.getErrorMsg() + " , " + e.getMessage());
        }
        finally {
            System.out.println("Finally block");
        }


    }
}
