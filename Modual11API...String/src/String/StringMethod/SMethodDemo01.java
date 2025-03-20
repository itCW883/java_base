package String.StringMethod;

public class SMethodDemo01 {
    public static void main(String[] args) {
        String s1="abc";
        String s2=new String("abc");
        String s3=new String("ABC");
        //equals(返回值类型boolean):
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        //equalsIgnoreCase(返回值类型boolean):不区分字母的大小写
        System.out.println(s1.equalsIgnoreCase(s3));

    }


}
