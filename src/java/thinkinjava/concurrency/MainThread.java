package thinkinjava.concurrency;

/**
 * Created by yelianghuo on 2018/7/15.
 */

class threadTest extends Thread {

    String name;

    public threadTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            new Thread(new ListOff(), name).run();
        }

    }

}

public class MainThread {

    public static void main(String[] args) throws Exception{

//        Thread thread = null;
        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName());
            new threadTest(Integer.toString(i)).run();
//            thread = new Thread(new ListOff());
//            thread.start();
        }
        System.out.println("begin----------");

    }
}
