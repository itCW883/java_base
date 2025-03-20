package b_RegularExpression;

import java.util.Arrays;

public class RegexDemo01 {
    public static void main(String[] args) {
        //method01();
        //method02();
       // method03();
        //method04();
        //method05();
        method06split();
    }
//split
    private static void method06split() {
        String s1="abc hehe hahaha";
        String[] arr1 = s1.split(" +");//+号代表多个
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        String s2 = s1.replaceAll(" +", "fu ");
        System.out.println("s2 = " + s2);
    }

    //分组括号
    private static void method05() {
        //校验BC的可以出现任意次
        boolean result12 = "ABC的2345BC的".matches("[\\d](BC的)");
        System.out.println("result12 = " + result12);
    }

    //数量词
    private static void method04() {
        //1.验证字符串是否为三位数
        boolean result09 = "1111".matches("\\d{3}");
        System.out.println("result09 = " + result09);
        //2:验证手机号1开头第二位为3/5/8剩下的为0-9的数字
        boolean result10 = "13838381438".matches("[1][358]\\d[9]");
        System.out.println("result10 = " + result10);
        //3:验证QQ号不能是0开头,且全为数字,长度为5--15
        boolean result11 = "123456789000".matches("[1-9]\\d{0,14}");
        System.out.println("result11 = " + result11);
    }

    //预定义字符
    private static void method03() {
        //1:验证是否是三位数字
        boolean result06 = "111".matches("\\d\\d\\d");
        System.out.println("result06 = " + result06);
        //2:验证手机号1开头第二位为3/5/8剩下的为0-9的数字
        boolean result07 = "13838381438".matches("[1][358]\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        System.out.println("result07 = " + result07);
        //3:验证字符串是否以h开头d结尾中间是任意字符
        boolean result08 = "h6d".matches("[h].[d]");
        System.out.println("result08 = " + result08);


    }

    //逻辑运算符类正则表达式
    private static void method02() {
        //1:要求字符串是小写字母开头;并且字母不能是[aeiou]开头,后面以ad结尾
        boolean result04 = "yad".matches("[[a-z]&&[^aeiou]][a][d]");
        System.out.println("result04 = " + result04);

        //2:要求字符是aeiou开头,后面以ad结尾/|或的用法
        boolean result05 = "had".matches("[[a]|[e]|[i]|[o]|[u]][a][d]");
        System.out.println("result05 = " + result05);


    }

    //字符类正则表达式
    private static void method01() {
        //1:验证字符串是否以h开头e结尾中间是aeiou
        boolean result01 = "hyd".matches("[h][aeiou][d]");
        System.out.println("result01 = " + result01);
        //2:验证字符串是否以h开头d结尾中间不是aeiou
        boolean result02 = "hyd".matches("[h][^aeiou][d]");
        System.out.println("result02 = " + result02);
        //3:验证字符串是否以小写a-z开头ad结尾
        boolean result03 = "had".matches("[a-z][a][d]");
        System.out.println("result03 = " + result03);

    }
}
