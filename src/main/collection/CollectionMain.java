package main.collection;

import com.sun.source.tree.Tree;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();  // in array list any number of null values can be inserted
        for(int i=0;i<6;++i)
            lst.add(i+1);
        lst.add(null);
        lst.add(null);
        System.out.println(lst);
        lst.remove(new Integer(1)); // object based removal
        lst.remove(3);  // index based removal
        System.out.println(lst);


        SortedSet<Integer> st = new TreeSet<>();
        st.add(1);
        st.add(43);
//        st.add(null); //  Sorted set doesn't allow null insertion
        st.forEach(System.out::print);
        System.out.println();

        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(1);
        linkedSet.add(2);
        linkedSet.add(4);
        linkedSet.add(3);
        linkedSet.add(4);
        linkedSet.add(null);

        Iterator<Integer> it = linkedSet.iterator();
        while(it.hasNext())
            System.out.print(it.next());

        System.out.println();

        Map<Integer, String> mp = new Hashtable<>();
        mp.put(12, "twelve");
        mp.put(2, "two");
        mp.put(31, "thirty one");
        mp.put(4, "four");
        mp.put(5, "five");

//        mp.put(0, null);
//        mp.put(null, "NULL"); // hash table doesn't allow null key or null value

        System.out.println(mp);

        Map<Integer, Integer> hmp = new HashMap<>();    // one null key and multiple null values can be allowed in hashmap
        hmp.put(1, 2);
        hmp.put(2, 3);
        hmp.put(3, null);
        hmp.put(4, null);

        System.out.println(hmp);

        // Sorted map and tree map works like sorted set and tree set
        // doesn't allow any null key but allows multiple null values

    }
}
