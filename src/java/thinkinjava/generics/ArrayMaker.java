package thinkinjava.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by yelianghuo on 2018/8/2.
 */
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringArrayMaker = new ArrayMaker<String>(String.class);

        String[] strings = stringArrayMaker.create(9);

        System.out.println(Arrays.toString(strings));
    }
}
