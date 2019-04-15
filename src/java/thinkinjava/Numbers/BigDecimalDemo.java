package thinkinjava.Numbers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URLEncoder;

public class BigDecimalDemo {
    public static void main(String[] args) throws Exception{
        BigDecimal b1 = new BigDecimal("9.99");


        BigDecimal b2 = new BigDecimal("300.00");

        BigDecimal b3 = new BigDecimal("-500.444");

//        b2.setScale(2, RoundingMode.HALF_UP);
//        b2.setScale(2,BigDecimal.ROUND_HALF_UP);


        System.out.println(b1.stripTrailingZeros().toPlainString());
        System.out.println(b2.stripTrailingZeros().toPlainString());



        double d = b1.divide(b2,1, RoundingMode.HALF_UP).doubleValue();
        //System.out.println(d * 10 % 10);

        System.out.println(URLEncoder.encode("https://test.i.meituan.com/detail/F2nt9Syo?productId=10835676&shopId=85043985", "UTF-8"));
    }
}
