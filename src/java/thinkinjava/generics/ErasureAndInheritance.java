package thinkinjava.generics;

/**
 * Created by yelianghuo on 2018/8/2.
 */

class GenericBase<T> {
    private T element;

    public void set(T arg) {
        this.element = arg;
    }

    public T get() {
        return this.element;
    }
}

class Derive1 extends GenericBase{}

public class ErasureAndInheritance {
    public static void main(String[] args) {
        Derive1 derive1 = new Derive1();
        Object o = derive1.get();
        System.out.println(o);
        derive1.set("11");
        o = derive1.get();
        System.out.println(o.getClass());
    }
}
