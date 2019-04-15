package worktest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PigeonDateTest {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) throws Exception{

        long start = sdf.parse("2019-02-28 01:06:00").getTime();
        long end = sdf.parse("2019-02-20 10:03:42").getTime();
        System.out.println(start);
        System.out.println(end);
        longToDate(1550056859000L);
        longToDate(1543507200000L);

        System.out.println(Long.parseLong(String.valueOf(33498239)));

        testDivide();

        final String s = System.getProperty("java.class.path");
        System.out.println("sss:" + s);

    }

    private static void longToDate(Long time) {
        Date date = new Date(time);
        System.out.println(date);
    }

    private static void testDivide() {
        System.out.println(95/100);
    }

    // {"shopIds": [101276050], "platform": "0", "pageSize":50, "inSale": false, "inReceipt": true, "withSoldOut": true, "platBiz": 4 }
    // {"shopIds": [102132455], "platform": "0", "pageSize":50, "inSale": false, "inReceipt": true, "withSoldOut": true, "platBiz": 4 }


    //{"bizId": 18295806, "beginDate":1539493560 ,  "endDate":1538370360 , "status":1, "arriveStatus": -1, "pageNo":1, "pageSize":10, "leadsTypeEnum":1 }
}
