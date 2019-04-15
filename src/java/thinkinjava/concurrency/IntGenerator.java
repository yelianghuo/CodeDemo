package thinkinjava.concurrency;

/**
 * Created by yelianghuo on 2018/9/10.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    public void setCanceled() {canceled = true;}

    public boolean isCanceled() {return canceled;}
}
