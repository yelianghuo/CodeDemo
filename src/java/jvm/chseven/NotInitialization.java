package jvm.chseven;

public class NotInitialization {
    public static void main(String[] args) {
        //System.out.println(SubClass.value);

        SuperClass[] sca = new SuperClass[10];
        System.out.println(sca.length);
        System.out.println(ConstClass.str);
    }
}
