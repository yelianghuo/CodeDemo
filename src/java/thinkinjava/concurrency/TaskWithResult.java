package thinkinjava.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by yelianghuo on 2018/7/15.
 */
class Task implements Callable<String> {
    private int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of task: " + id;
    }
}

public class TaskWithResult{
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Future<String>> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            results.add(executorService.submit(new Task(i)));
        }

        for(Future<String> f : results) {
            System.out.println(f.isDone());
        }

        for(Future<String> f : results) {
            System.out.println(f.get());
        }

    }
}
