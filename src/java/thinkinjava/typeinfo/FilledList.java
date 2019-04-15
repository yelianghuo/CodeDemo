package thinkinjava.typeinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yelianghuo on 2018/7/11.
 */

class CountedInteger {
    private static long counter;

    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T> {

    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElements) {
        List<T> result = new ArrayList<T>();
        try {
            for (int i = 0; i < nElements; i++) {
                result.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) throws Exception{
//        FilledList<CountedInteger> f1 = new FilledList<>(CountedInteger.class);
//        System.out.println(f1.create(15));

        Class<CountedInteger> countedIntegerClass = CountedInteger.class;

        CountedInteger countedInteger = (CountedInteger) countedIntegerClass.newInstance();
        CountedInteger countedInteger1 = (CountedInteger) countedIntegerClass.newInstance();
        System.out.println(countedInteger1);
    }
}
