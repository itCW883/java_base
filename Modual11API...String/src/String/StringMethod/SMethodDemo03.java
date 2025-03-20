package String.StringMethod;

import java.io.UnsupportedEncodingException;

public class SMethodDemo03 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="abcdefg";
        //char[] toCharArry-->将字符串转换为char数组
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.printf(charArray[i]+" ");//结果为: a b c d e f g
        }
        System.out.println();
        System.out.println("=================");
        //byte[] getBytes-->将字符串转换为byte数组
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.printf(bytes[i]+" ");//结果为: 97 98 99 100 101 102 103
        }
        System.out.println();
        System.out.println("=================");
        //String replace(CharSequence c1,CharSequence c2)-->替换字符串CharSequence-->String的接口
                //CharSequence是String实现的一个接口
        System.out.println(s.replace("a", "z"));
        System.out.println();
        System.out.println("=================");
        //byte[] getBytes(String charsetName)-->按照指定编码将字符串转换为byte数组
                //charsetName编码方式的名字
        byte[] bytes1 = s.getBytes("utf-16");//结果为 -2 -1 0 97 0 98 0 99 0 100 0 101 0 102 0 103
        for (int i = 0; i < bytes1.length; i++) {
            System.out.printf(bytes1[i]+" ");
        }
    }

}
