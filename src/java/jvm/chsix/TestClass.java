package jvm.chsix;

public class TestClass {
    private int m;

    public int inc(){
        int x;
        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }

    public static void main(String[] args) {
        TestClass t = new TestClass();
        System.out.println(t.inc());
    }
}


