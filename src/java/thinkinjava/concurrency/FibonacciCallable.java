package thinkinjava.concurrency;


import thinkinjava.generics.Fibonacci;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by yelianghuo on 2018/9/9.
 */


class Core implements Callable<Integer> {
    Fibonacci fibonacci;

    public Core(Fibonacci fi) {
        this.fibonacci = fi;
    }


    @Override
    public Integer call() throws Exception {
        return fibonacci.next();
    }
}

public class FibonacciCallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Fibonacci fibonacci = new Fibonacci();
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            futures.add(executorService.submit(new Core(fibonacci)));
        }

        int sums = 0;
        for(Future<Integer> future : futures) {
            try {
                sums += future.get();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                executorService.shutdown();
            }
        }
        System.out.println(sums);
    }
}
