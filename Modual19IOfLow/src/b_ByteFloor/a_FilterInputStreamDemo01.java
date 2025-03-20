package b_ByteFloor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;




public class a_FilterInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
       //method01();
       //method02();
        method3();//UTF-8一个汉字占三个字节;因此创建一个三个字节的byte数组用于做存放的容器

    }

    private static void method3() throws IOException {
        FileInputStream dts2 = new FileInputStream("Modual19IOfLoor\\1.txt");
        byte[] bytes = new byte[3];//UTF-8一个汉字占三个字节;因此创建一个三个字节的byte数组用于做存放的容器
        int len;
        while((len=dts2.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }


        dts2.close();
    }

    private static void method01() throws IOException {
        File file = new File("Modual19IOfLoor\\src\\b_ByteFloor\\a_3.txt");
        FileInputStream fis1 = new FileInputStream(file);
        //int read()
        //从该输入流读取一个字节的数据。
        //System.out.println(fis1.read());//若读取出来的值wei-1就代表值读取完毕了
        while(fis1.read()!=-1){
            System.out.println(fis1.read());

        }
        //注意:1:一个对象读取完毕就别再去取了;在读取也读不到东西\
        //     2:流关闭后;流对象就不能继续使用了
        //系统的每个文件末尾都会有一个结束标记;read方法规定读取到文件的结束标记直接返回-1


        fis1.close();
    }

    private static void method02() throws IOException {
        FileInputStream dts2 = new FileInputStream("Modual19IOfLoor\\1.txt");
        byte[] bytes = new byte[1024];
        //创建一个byte数组
        //创建的数组相当于一个零时存储区域
        //要读取的值会临时存储到byte数组中
        //再从数组中将数据获取
        //数组长度定为多少一次就读取多少数据
        //数组的长度一般定为1024的倍数;若剩下的字节不够数组长度就会有多少读多少
        //dts2.read(bytes)返回的是读取个数

        //int read(byte[] b)
        //从该输入流读取最多 b.length个字节的数据为字节数组。
        int read = dts2.read(bytes);//传入的是数组
        System.out.println(read);

        //循环读取
        System.out.println(new String(bytes,0,read));
        //new String(bytes,0,read)实例化字符串;将一个byte数组从某个位置开始到某个位置结束转为字符串

        //System.out.println(new String(bytes));//读取时会出现数据错乱;原因是读取覆盖的因素
        dts2.close();

    }


}
