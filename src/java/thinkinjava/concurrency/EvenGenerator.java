package thinkinjava.concurrency;

/**
 * Created by yelianghuo on 2018/9/10.
 */
public class EvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public int getCurrentEvenValue() {
        return currentEvenValue;
    }

    @Override
    public String toString() {
        return "current value : " + currentEvenValue;
    }

    public static void main(String[] args) {
        IntGenerator g = new EvenGenerator();
        EvenChecker.test(g);

    }
}
