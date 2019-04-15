package thinkinjava.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by yelianghuo on 2018/7/17.
 */
public class SimpleDaemons implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {

                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }

        System.out.println("all daemon thread started");
        TimeUnit.MILLISECONDS.sleep(11);
    }
}
