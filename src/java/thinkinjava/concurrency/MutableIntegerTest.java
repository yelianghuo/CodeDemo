package thinkinjava.concurrency;

/**
 * Created by yelianghuo on 2018/7/26.
 */
public class MutableIntegerTest {

    public static class Thread_one extends Thread {

        private MutableInteger mutableInteger;

        public Thread_one(MutableInteger mutableInteger) {this.mutableInteger = mutableInteger;}

        public void run() {
            int i = 5;
            while(i-- >= 0) {
                System.out.println(this.getClass().getName() + ": " + mutableInteger.getValue() );
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static class Thread_two extends Thread {

        private MutableInteger mutableInteger;

        public Thread_two(MutableInteger mutableInteger) {this.mutableInteger = mutableInteger;}

        public void run() {
            while(true) {
                mutableInteger.setValue(123);
//                try {
//                    Thread.sleep(100);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }

            }
        }
    }

    public static void main(String[] args) {
        MutableInteger mutableInteger = new MutableInteger();
        new Thread_two(mutableInteger).start();
        new Thread_one(mutableInteger).start();
    }
}
