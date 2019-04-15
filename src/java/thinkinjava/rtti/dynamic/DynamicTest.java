package thinkinjava.rtti.dynamic;



import thinkinjava.rtti.plugin.ExampleIntercepts;
import thinkinjava.rtti.plugin.Intercepts;

import java.lang.reflect.Proxy;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Created by yelianghuo on 2018/7/11.
 */
public class DynamicTest {

    public static void main(String[] args) {
//        DynamicProxy dynamicProxy = new DynamicProxy(new Vendor());
//        Sell sell = (Sell) (Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[]{Sell.class}, dynamicProxy));

        Intercepts intercepts = new ExampleIntercepts();
        Sell s = (Sell)intercepts.plugin(new Vendor());
        s.sell("product");

//
//        sell.sell("product");
//        System.out.println(sell.getClass());
//        sell.ad();
//
//        Pattern p = Pattern.compile("\\w+\\.");
//        System.out.println(p.pattern());
        BinaryOperator<Long> add = (x, y) -> x + y;
        System.out.println(add.apply(3L, 4L));

    }
}
