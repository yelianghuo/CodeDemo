package thinkinjava.enumerated;

/**
 * Created by yelianghuo on 2018/7/22.
 */

enum Activity {
    SITTING, LYING, STANDING, HOPPING,
    RUNNING, DODING, JUMPING, FALLING, FLYING;
}


public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Enums.random(Activity.class) + " ");
        }
    }
}
