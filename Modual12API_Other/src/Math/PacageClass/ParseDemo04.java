package Math.PacageClass;

public class ParseDemo04 {
    public static void main(String[] args) {
        //Method01();
        Method02();
    }

    private static void Method02() {
        int num1 = Integer.parseInt("11111");
        System.out.println(num1 + 1);
    }

    private static void Method01() {
        int i=10;
        String s1=i+"";//通过+转换为字符串类型

        String s2 = String.valueOf(i);//通过String.valueOf()方法转换为字符串类型

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
