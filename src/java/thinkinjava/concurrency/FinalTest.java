package thinkinjava.concurrency;

import java.util.*;
/**
 * Created by yelianghuo on 2018/7/31.
 */

class ListStorage{
    private final List<Integer> integerList;

    public ListStorage(List<Integer> list) {
        this.integerList = list;
    }

    @Override
    public String toString() {
        return integerList.toString();
    }
}

public class FinalTest {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(1);test.add(2);

        ListStorage listStorage = new ListStorage(test);
        System.out.println(listStorage.toString());

        test.add(3);
        test.add(4);
        System.out.println(listStorage.toString());
    }
}
