package thinkinjava.enumerated;

/**
 * Created by yelianghuo on 2018/7/22.
 */
public enum OzWitch {
    WEST("west"),
    NORTH("north"),
    EAST("east"),
    SOUTH("south");

    private String des;

    private OzWitch(String des) {
        this.des = des;
    }

    public String getDescription() {
        return des;
    }

    public static void main(String[] args) {
        for(OzWitch o : OzWitch.values()) {
            System.out.println(o + ": " + o.getDescription());
        }
    }
}
