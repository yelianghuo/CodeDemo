package thinkinjava.concurrency;

/**
 * Created by yelianghuo on 2018/7/15.
 */
public class ListOff implements Runnable {



    protected int countDown = 10;

    private static int taskCount = 0;

    private final int id = taskCount++;

    public ListOff() {
//        System.out.println("$" + id + "initing.....");
    }

    public ListOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return Thread.currentThread().getName() + ": #" +id + "(" +
                (countDown > 0 ? countDown : "ListOff!") + "), \n";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}
