package Math.BigInteger;

import java.math.BigInteger;

public class BigIntegerDemo01 {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("1111111111111111111111111111111111111111111111111111111111111111111111");
        BigInteger b2= new BigInteger("22222222222222222222222222222222222222222222222222222222222222222");
        BigInteger b3 = new BigInteger("1111111111111111111111111111111111111111111111111111111111111111111119");
        //BigInteger add(BigInteger val)加 返回值为 (this + val)
        System.out.println(b1.add(b2));
        //BigInteger subtract(BigInteger val)减 返回值为 (this - val)
        System.out.println(b1.subtract(b2));
        //BigInteger multiply(BigInteger val)乘 返回值为 (this * val)
        System.out.println(b1.multiply(b2));
        //BigInteger divide(BigInteger val)除 返回值为 (this / val)
        System.out.println(b1.divide(b2));

        //求绝对值
        BigInteger abs = b1.subtract(b3).abs();
        System.out.println(abs);

        //longValue()
        //将此BigInteger转换为 long 。
        long lg = abs.longValue();
        System.out.println(lg);

        //intValue()
        //将此BigInteger转换为 int 。
        int it = abs.intValue();
        System.out.println(it);
    }
}
