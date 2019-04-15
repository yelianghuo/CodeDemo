package thinkinjava.enumerated;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by yelianghuo on 2018/7/22.
 */

enum Explore{
    HERE,
    THERE;
}

public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {
        System.out.println("----- Analyze " + enumClass + " -----");
        System.out.print("Interface: ");
        for(Type t : enumClass.getGenericInterfaces())
            System.out.println(t);

        System.out.println("Base: " + enumClass.getSuperclass());
        System.out.println("Method: ");
        Set<String> methods = new TreeSet<>();

        for(Method m : enumClass.getMethods()) {
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {

    }
}
