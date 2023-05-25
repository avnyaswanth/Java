package main.strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("Alapati");
        System.out.println(sbd);
    }

    // methods are non synchronised
    // at a time only multiple threads can access the string buffer object
    // no thread saftey
    // relatively fast performance
}
