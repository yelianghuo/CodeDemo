package thinkinjava.collection;

import java.util.*;

public class SetVsList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 2);
        List<Integer> list1 = Arrays.asList( 4, 2);

        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(list1);
        set.removeAll(set1);
        System.out.println(set);
    }
}
