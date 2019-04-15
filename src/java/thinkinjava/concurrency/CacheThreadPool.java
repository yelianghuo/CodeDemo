package thinkinjava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by yelianghuo on 2018/7/15.
 */
public class CacheThreadPool {

    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            executorService.execute(new ListOff());
        }

        executorService.awaitTermination(1, TimeUnit.MILLISECONDS);

        executorService.shutdown();

        System.out.println("aaaaaaa");
    }
}
