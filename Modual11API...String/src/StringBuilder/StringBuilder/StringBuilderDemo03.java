package StringBuilder.StringBuilder;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = sb.append("王城");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb == sb1);
        sb.append("李锐").append("love").append("六六六");//链式调用[调用某一个方法,该方法返回了一个对象,再接着调用方法(返回对象的所有方法)]
        System.out.println(sb);
        sb.reverse();//翻转字符串
        System.out.println(sb);
        sb.toString();//将StringBuilder转为String形式
    }
}
