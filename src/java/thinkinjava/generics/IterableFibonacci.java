package thinkinjava.generics;

import java.util.Iterator;

/**
 * Created by yelianghuo on 2018/7/29.
 */
public class IterableFibonacci implements Iterable<Integer> {

    private int n;

    private Fibonacci fib;

    public IterableFibonacci(int count) {
        this.n = count;
        fib = new Fibonacci();
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n>0;
            }

            @Override
            public Integer next() {
                n--;
                return fib.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(int i : new IterableFibonacci(18))
            System.out.print(i + "  ");
    }
}

