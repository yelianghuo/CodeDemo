package thinkinjava.generics;

public class MethodGeneric {
    public static <T> T test(int i) {
        if (i == 1) {
            return (T)"hello world";
        } else {
            return (T) new Integer(1024);
        }
    }

    public static void main(String[] args) {
        Object o = test(1);
        System.out.println(o.getClass().getTypeName());
    }
}
