package String.StringMethod;

public class SMethodDemo02 {
    public static void main(String[] args) {
        String s1="abcdefg";
        //获取字符串长度
        System.out.println(s1.length());//7
                    //length()这个length()代了()表示是一个方法;与
                    // 数组中的length不同,数组的length代表的是数组的一个属性
        //字符串拼接返回新串
        System.out.println(s1.concat("哈哈哈"));//abcdefg哈哈哈
        //根据索引获取对应字符串
        System.out.println(s1.charAt(0));//a
        //获取指定字符串在大字符串中第一次出现的索引位置
        System.out.println(s1.indexOf("bcd"));//1
        //截取字符串,从指定索引开始截取到最后,返回新串
        System.out.println(s1.substring(3));//defg
        //截取字符串从beginIndex开始,到endIndex结束
        //含头不含尾返回新串
        System.out.println(s1.substring(2, 5));//cde
    }
}
