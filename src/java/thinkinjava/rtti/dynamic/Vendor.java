package thinkinjava.rtti.dynamic;

/**
 * Created by yelianghuo on 2018/7/11.
 */
public class Vendor implements Sell {
    @Override
    public void sell(String arg) {
        System.out.println("In sell method :" + arg);
    }

    @Override
    public void ad() {
        System.out.println("ad method");
    }
}
