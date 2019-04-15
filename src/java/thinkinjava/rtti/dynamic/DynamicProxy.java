package thinkinjava.rtti.dynamic;

import thinkinjava.rtti.plugin.Intercepts;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by yelianghuo on 2018/7/11.
 */
public class DynamicProxy implements InvocationHandler {
    private Object target;

    // 借助Intercepts对象，在生成代理对象warp()和invoke()方法中，实现相关的拦截逻辑

    private Intercepts intercepts;

    public static Object warp(Object target, Intercepts intercepts) {
        // todo intercepts

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new DynamicProxy(target));
    }


    public DynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // todo
        System.out.println(proxy.getClass());
        if(method.getName().equals("sell")) {
            System.out.println("matched...");
        }

        System.out.println("before");
        Object result = method.invoke(target, args);
        System.out.println("after");
        return result;
    }
}
