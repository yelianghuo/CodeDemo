package thinkinjava.generics;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yelianghuo on 2018/7/29.
 */
public class New {

    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }
}
