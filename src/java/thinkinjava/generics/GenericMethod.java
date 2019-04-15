package thinkinjava.generics;

/**
 * Created by yelianghuo on 2018/7/23.
 */
public class GenericMethod {

    public <T> T types(T s) {
        return s;
    }

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.f("");
        gm.f(1);

        Fibonacci fib = new Fibonacci();

        for (int i = 0; i < 18; i++) {
            System.out.print(gm.types(fib).next() + "  ");
        }

    }
}
