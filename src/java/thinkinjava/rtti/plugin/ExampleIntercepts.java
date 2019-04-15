package thinkinjava.rtti.plugin;

import thinkinjava.rtti.dynamic.DynamicProxy;

import java.lang.reflect.Proxy;

public class ExampleIntercepts implements Intercepts {


    @Override
    public Object plugin(Object target) {
        return DynamicProxy.warp(target, this);
    }
}
