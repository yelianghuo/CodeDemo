package thinkinjava.generics;

/**
 * Created by yelianghuo on 2018/7/29.
 */
public class Fibonacci implements Generator<Integer> {
    @Override
    public Integer next() {
        return fib(count++);
    }
    private int count = 0;
    private int fib(int n) {
        if (n < 2) {
            return 1;
        } else
            return fib(n-2) + fib(n-1);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();

        for (int i = 0; i < 18; i++) {
            System.out.print(gen.next() + "  ");

        }
    }
}
