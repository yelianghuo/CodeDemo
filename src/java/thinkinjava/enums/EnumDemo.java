package thinkinjava.enums;

/**
 * Created by yelianghuo on 2018/7/16.
 */
public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today.toString() + ": " + today.ordinal());
        Day d = Enum.valueOf(Day.class, "SUNDAY");
        System.out.println(d);
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}