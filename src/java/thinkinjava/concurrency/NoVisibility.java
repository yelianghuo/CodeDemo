package thinkinjava.concurrency;

/**
 * Created by yelianghuo on 2018/7/26.
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            number = 0;
            ready = false;

            new ReaderThread().start();
            number = 42;
            ready = true;
        }
    }
}
