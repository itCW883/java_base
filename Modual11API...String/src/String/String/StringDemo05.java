package String.String;

public class StringDemo05 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="world";
        String s3="helloworld";
        String s4="hello"+"world";
        String s5=s1+"world";   //会new一个StringBuilder
        String s6=s1+s2;    //会new一个StringBuilder

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
    }
}
