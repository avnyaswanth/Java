package main.collection;

import java.util.*;

public class ListCollection {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(null);
        stk.push(null);
        System.out.println(stk);

        List<Integer> lst = new LinkedList<>();
        lst.add(null);
        lst.add(null);
        System.out.println(lst);

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(null);
        arrayList.add(null);
        System.out.println(arrayList);

        List<Integer> vector = new Vector<>();
        vector.add(null);
        vector.add(null);
        System.out.println(vector);
    }
}
