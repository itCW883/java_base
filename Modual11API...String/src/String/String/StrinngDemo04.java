package String.String;

public class StrinngDemo04 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");//实例化对象了所有并没有共享s1的地址;但内容是共享s1的
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s2 == s3);//false
    }
}
