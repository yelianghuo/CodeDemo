package thinkinjava.generics;

/**
 * Created by yelianghuo on 2018/7/31.
 */
public class CountedObject extends Object{
    private static long counter = 0;

    private final long id = counter++;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
