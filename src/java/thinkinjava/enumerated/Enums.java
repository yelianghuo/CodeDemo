package thinkinjava.enumerated;

import java.util.Random;

/**
 * Created by yelianghuo on 2018/7/22.
 */
public class Enums {

    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ex) {
        return random(ex.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }
}
