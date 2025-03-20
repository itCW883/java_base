package String.String;

public class StringDemo01 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        System.out.println(s1.getClass().getName()+"@"+Integer.toHexString(s1.hashCode()));//java.lang.String@17862
        System.out.println(s2.getClass().getName()+"@"+Integer.toHexString(s2.hashCode()));//java.lang.String@17862
    }
}
