package String.String;

public class StringDemo02 {
    public static void main(String[] args) {
// 1:String();使用无参构造
        String s1=new String();
        System.out.println(s1);
// 2:String(String original);根据字符串创建String对象
        String s2=new String("abc");
        System.out.println(s2);
// 3:String(char[] value);根据char数组创建String对象
        char[] chars={'a','b','c'};
        String s3=new String(chars);
        System.out.println(s3);
// 4:String(byte[] bytes);通过平台指定的字符集解码指定的byte数组,构造一个新的String
        byte[] bytes={97,98,99};//byte数组是通过utf-8对应的编码,在转换为jbk来确定字符的
        String s4=new String(bytes);
        System.out.println(s4);
        byte[] byte2={-97,-98,-99};//���没有对应的中文
        String s5=new String(byte2);
        System.out.println(s5);//如果byte数组没有对应的中文就会出现乱码
        byte[] byte3={-28,-67,-96};//对应的中文为"你",idea启动时会加一个启动参数,启动参数为-Dfile.encoding=UTF-8
        String s6=new String(byte3);
        System.out.println(s6);
// 5:简化形式String 变量名=值;
        String s7="abc";
        System.out.println(s7);
    }
}
