package thinkinjava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yelianghuo on 2018/9/10.
 */
public class EvenChecker implements Runnable{
    private IntGenerator generator;
    private final int id;
    public EvenChecker(IntGenerator g, int ident) {
        generator = g;
        id = ident;
    }

    @Override
    public void run() {
        while (!generator.isCanceled()){
            int val = generator.next();
            if(val % 2 != 0) {
                System.out.println(val + "not even");
                generator.setCanceled();
            }
        }

    }

    public static void test(IntGenerator g, int count) {
        System.out.println("press control-c to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecker(g, i));
        }
        exec.shutdown();
    }

    public static void test(IntGenerator g) {
        test(g, 10);
    }
}
