package main.collection;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;++i)
            lst.add(sc.nextInt());

//        Collections.sort(lst);
        Collections.sort(lst, Collections.reverseOrder());  // descending order sorting
        System.out.println(Collections.binarySearch(lst, 5));
        Collections.reverse(lst);
        Collections.swap(lst, 0, lst.size()-1);
        System.out.println(Collections.max(lst));
        System.out.println(Collections.min(lst));
        Collections.frequency(lst, 4);

    }
}
