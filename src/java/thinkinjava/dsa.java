package thinkinjava;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/**
 * Created by yelianghuo on 2018/7/11.
 */


class person{
    int id;

    person() {}

    person(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }
}

public class dsa {

    static void sss(person p) {
        p.setId(112);
    }

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, 4);
        Date relativeReceiptEndDate = calendar.getTime();

        System.out.println(relativeReceiptEndDate);
    }
}
