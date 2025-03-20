package Math.PacageClass;

public class IntegerDemo03 {
    public static void main(String[] args) {
        Integer i=10;//发生了自动装箱
        System.out.println(i);
        int sum = i + 20;//发生了自动拆箱
        System.out.println(sum);
    }
}
