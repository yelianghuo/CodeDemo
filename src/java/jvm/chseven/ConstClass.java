package jvm.chseven;

public class ConstClass {
    static {
        System.out.println("const class init");
    }
    public static final String str = "hello world";
}
