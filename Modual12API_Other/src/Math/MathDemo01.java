package Math;

public class MathDemo01 {
    public static void main(String[] args) {
        //Static int abs(int a) -->求参数的绝对值
        System.out.println(Math.abs(-6));
        //Static double cell(double a) -->向上取整
        System.out.println(Math.ceil(0.1));
        //Static double floor(double a) -->向下取整
        System.out.println(Math.floor(0.9));
        //Static long round(double a) -->四舍五入
        System.out.println(Math.round(-4.123459));
        //Static int max(int a,int b) -->求两个数之间的较大值
        System.out.println(Math.max(111, 222));
        //Static int min(int a,int b) -->求两个数之间的较小值
        System.out.println(Math.min(111, 222));
    }
}
