package String.StringMethod;

public class SMethodOtherMth {
    public static void main(String[] args) {
        String s1="abcdefG ";
        //boolean contains(String s)//-->判断老串是否包含指定的串
        System.out.println(s1.contains("abc"));//判断s1中是否包含"abc"
        //boolean endWith(String s)//-->判断老串是否可以以指定的串结尾
        System.out.println(s1.endsWith("de"));//判断是否以de结尾
        //boolean starWith(String s)//-->判断老串是否可以以指定的串开头
        System.out.println(s1.startsWith("abc"));//判断s1是否以"abc"开头
        //String toLowerCase()//-->将字母转换为小写
        System.out.println(s1.toLowerCase());//结果为: "abcdefg "
        //String toUperCase()//-->将字母转换为大写
        System.out.println(s1.toUpperCase());//结果为: "ABCDEFG "
        //String trim()//-->去掉字符串两端的空格
        System.out.println(s1.trim());//结果为: "abcdefG"
    }
}
