package thinkinjava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yelianghuo on 2018/7/17.
 */
public class SimplePriorities implements Runnable {
    private int countDown = 5;

    private volatile double d;

    private int priority;
    private String name;

    public SimplePriorities(int priority, String name){
        this.priority = priority;
        this.name = name;
    }

    public String toString() {

        return Thread.currentThread() + ": " + countDown;
    }


    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        Thread.currentThread().setName(name);
        while (true) {
            for (int i = 1; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double)i;
                if(i % 1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            if(--countDown == 0)
                return;
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            executorService.execute(new SimplePriorities(Thread.MIN_PRIORITY, "thread " + Integer.toString(i)));
        }

        executorService.execute(new SimplePriorities(Thread.MAX_PRIORITY, "thread " + Integer.toString(5)));

        executorService.shutdown();
    }
}
