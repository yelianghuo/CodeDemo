package thinkinjava.concurrency;

/**
 * Created by yelianghuo on 2018/7/26.
 */

class InnerThread1 {
    private int countDown = 5;
    private Inner inner;
    private class Inner extends Thread {
        Inner(String name) {
            super(name);
            start();
        }
        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    if(--countDown == 0) return;
                    sleep(10);
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String toString(){
            return getName() + ": " + countDown;
        }
    }

    public InnerThread1(String name) {
        inner = new Inner(name);
    }

}

public class ThreadVariations {
    public static void main(String[] args) {
        new InnerThread1("InnerThread1");
    }
}
