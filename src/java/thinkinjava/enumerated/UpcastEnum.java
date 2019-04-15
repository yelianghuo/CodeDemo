package thinkinjava.enumerated;

/**
 * Created by yelianghuo on 2018/7/22.
 */
enum Search{
    HITHER, YOU
}

public class UpcastEnum {
    public static void main(String[] args) {
        Enum e = Search.HITHER;
        for (Enum en : e.getClass().getEnumConstants()){
            System.out.println(en);
        }
    }
}
