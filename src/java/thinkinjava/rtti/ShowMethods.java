package thinkinjava.rtti;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Created by yelianghuo on 2018/7/11.
 */

public class ShowMethods {
    private static boolean DEBUG = true;

    private static String usage = "";

    private static Pattern p = Pattern.compile("\\w+\\.");

    public static String getUsage() {
        return usage;
    }

    public static void main(String[] args) throws Exception{
        if(args.length < 1) {
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] cons = c.getConstructors();
            for(Method m : methods) {
                System.out.println(p.matcher(m.toString()).replaceAll(""));
            }
            if(DEBUG) {
                try {
                    Method method = c.getMethod("getUsage");
                    System.out.println("get method: " + method);
                } catch (NoSuchMethodException n) {
                    n.printStackTrace();
                }

            }

            System.out.println(c.toString());
            for(Constructor con : cons) {
                System.out.println(p.matcher(con.toString()).replaceAll(""));
                //System.out.println(con.toString());
            }
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

