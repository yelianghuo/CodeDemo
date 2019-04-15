package thinkinjava.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class AttempLocking {
    private ReentrantLock lock = new ReentrantLock();
    public void untime() {
        boolean capture = lock.tryLock();
        try {
            System.out.println("tryLock(): " + capture);

        }finally {
            if(capture) {
                lock.unlock();
            }
        }
    }

    public void time() {
        boolean capture = false;
        try {
            capture = lock.tryLock(2, TimeUnit.SECONDS);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("tryLock(2 , TimeUnit.SECONDS) " + capture);

        } finally {
            if (capture) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws Exception{
         AttempLocking a = new AttempLocking();
        a.untime();
        a.time();
        new Thread() {
            {setDaemon(true);}

            @Override
            public void run() {
                a.lock.lock();
                System.out.println("acquired");
            }
        }.start();

        TimeUnit.SECONDS.sleep(2);
        Thread.yield();
        a.untime();
        a.time();
    }
}
