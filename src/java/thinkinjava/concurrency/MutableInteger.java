package thinkinjava.concurrency;

/**
 * Created by yelianghuo on 2018/7/26.
 */


public class MutableInteger {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
