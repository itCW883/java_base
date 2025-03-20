package b_ByteFloor;

import java.io.*;

public class a_FilterOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        method01();
        method02();
        method03();

    }

    private static void method03() throws IOException {
        String abc="鹅鹅鹅;曲项向天歌;白毛浮绿水;红掌拨清波\n";
        File file = new File("Modual19IOfLoor\\src\\b_ByteFloor\\a_3.txt");
        FileOutputStream fos2 = new FileOutputStream(file,true);
        fos2.write(abc.getBytes());
        fos2.close();
    }

    private static void method02() throws IOException {
        String abc="鹅鹅鹅;曲项向天歌;白毛浮绿水;红掌拨清波";
        byte[] bytes = abc.getBytes();
        File file = new File("Modual19IOfLoor\\src\\b_ByteFloor\\a_2.txt");
        FileOutputStream fos2 = new FileOutputStream(file);
        fos2.write(bytes);
        fos2.close();

    }

    private static void method01() throws IOException {

        //            FileOutputStream(String name)
        FileOutputStream fos1 = new FileOutputStream("Modual19IOfLoor\\1.txt");
        //指定的文件如果没有会自动创建一个新的文件(前提是路径正确)
        //每执行一次都会默认创建一个新的文件覆盖老文件

        //void write(int b)
        //一次写入一个字节的数据
        //将指定的字节写入此文件输出流。
        fos1.write(97);
        //字节会被翻译为ascll码表对应的字符


        //void write(byte[] b)
        //一次写入一个字节数组的数据
        //将 b.length个字节从指定的字节数组写入此文件输出流。
        String date = "\n鹅鹅鹅,曲项向天歌,白毛浮绿水,红掌拨清波";
        byte[] bytes = date.getBytes();
        byte[] a = {97,98,99,100,77};
        fos1.write(a);
        fos1.write(bytes);

        //void write(byte[] b, int off, int len)
        //byte[] b:写入的数组
        // int off:写入数据的起始位置
        // int len:写入数据的个数(长度)
        //一次写一个字符数组中的数据的一部分
        //将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。
        byte[] b = {97,98,99,100,77,101,110,123,114,111,112,113};
        fos1.write(b,2,4);

        //void close()
        //IO流对象需要使用该方法进行手动关闭;JC不能自动回收
        //关闭此文件输出流并释放与此流相关联的任何系统资源。
        fos1.close();
        //FileOutputStream(File file)
    }
}
