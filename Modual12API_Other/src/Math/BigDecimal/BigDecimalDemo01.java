package Math.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo01 {
    public static void main(String[] args) {
           //Big02();
           //Big03();
            Big04();
    }

    private static void Big04() {
        BigDecimal bd1 = BigDecimal.valueOf(2.12);
        BigDecimal bd2 = new BigDecimal("3.55");
        BigDecimal dv1 = bd2.divide(bd1, 2, RoundingMode.DOWN);
        System.out.println("dv1 = " + dv1);
        BigDecimal dv2 = bd2.divide(bd1, 2, RoundingMode.UP);
        System.out.println("dv2 = " + dv2);
        BigDecimal dv3 = bd2.divide(bd1, 2, RoundingMode.HALF_UP);
        System.out.println("dv3 = " + dv3);
    }

    private static void Big03() {
        BigDecimal bigDecimal1 = new BigDecimal("11.2345");
        BigDecimal bigDecimal2 = BigDecimal.valueOf(22.4543);
        System.out.println("bigDecimal1.divide(bigDecimal2,3,RoundingMode.HALF_UP) = "
                + bigDecimal1.divide(bigDecimal2, 3, RoundingMode.HALF_UP));
        System.out.println("bigDecimal2.divide(bigDecimal1,1,BigDecimal.ROUND_DOWN) = "
                + bigDecimal2.divide(bigDecimal1, 1, BigDecimal.ROUND_DOWN));
        BigDecimal subtract = bigDecimal2.subtract(bigDecimal1);
        double v = subtract.doubleValue();
        System.out.println("v = " + v);
    }

    private static void Big02() {
        BigDecimal b1 = new BigDecimal("3.55");
        //BigDecimal b2 = new BigDecimal("2.12");
        BigDecimal b2 = BigDecimal.valueOf(2.12);

        System.out.println("b1.add(b2) = " + b1.add(b2));
        System.out.println("b1.subtract(b2) = " + b1.subtract(b2));
        System.out.println("b1.multiply(b2) = " + b1.multiply(b2));
        //System.out.println("b1.divide(b2) = " + b1.divide(b2));//ArithmeticException运算异常
        System.out.println("b1.divide(b1,2, RoundingMode.HALF_DOWN) = " + b1.divide(b1, 2, RoundingMode.HALF_DOWN));
    }
}
