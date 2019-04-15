package thinkinjava.test;

/**
 * Created by yelianghuo on 2018/7/13.
 */
public class Mock {

    private static int getInt(boolean b) {
        if(b) {
            return 9;
        }else {
            return 10;
        }
    }

    public static void main(String[] args) {

        String a = "aaa";
        String b = new String("aaa");
        System.out.println(a.equals(b));
    }
}

