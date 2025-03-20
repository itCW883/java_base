package Math.BigDecimal;

public class BigDecimal02 {
    public static void main(String[] args) {
        Big01();
    }

    private static void Big01() {
        float a=3.55F;
        float b=2.12F;
        float result = a-b;//result = 1.4300001出现了精度损失问题
        System.out.println("result = " + result);
    }
}
