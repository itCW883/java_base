package String.String;

public class StringDemo03 {
    public static void main(String[] args) {
        //6:String(char[] value,int offset,int count)将char数组的一部分转换为String对象
                    //value要转为Sting的char数组
                    //offset重数组的那个索引开始转
                    //count转几个
        char[] chars={'a','b','c','d','e','f','g'};
        String s1=new String(chars,1,4);
        System.out.println(s1);
        //7:String(byte[] bytes,int offset,int length)将byte数组的一部分转换为String对象
                    //bytes要转String的byte数组
                    //offset重数组的那个索引开始转
                    //length要转多少个
        byte[] bytes =  {99,88,66,-28,-67,-96,11,22};
        String s2 =new String(bytes,3,3);
        System.out.println(s2);
    }
}
