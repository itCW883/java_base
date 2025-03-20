package String.StringMethod;

public class SMethodDemo04 {
    public static void main(String[] args) {
        //String[] split(String regex)-->按照指定规则分割字符串
        //注意String regex(为分割字符串的规则)实际上传输的是正则表达式
        //符号.在正则表达式中代表任意一个字符
        String s="abc,txt";
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        String s2="haha.hehe";
        String[] split2 = s2.split("\\.");//按照"."符号切割不了字符串,因为"."代表任意字符
                                                //需要加转义字符"\\"进行转意才可以
        for (int i = 0; i < split2.length; i++) {
            System.out.println(split2[i]);
        }
    }
}
