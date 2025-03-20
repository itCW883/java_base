package c_IOStreamPackage.IOUtils;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class a_IOutilsDemo01 {
    public static void main(String[] args) throws IOException {
        //静态方法:IOUtils.copy(InputStream in,OutputStream out);传递字节流实现文件复制
        //不需要使用close会直接关闭
        int copy = IOUtils.copy
                (new FileInputStream("Modual20IOFlow2\\src\\a_BufferFlow\\e_PrintStream\\z_打印流测试文件"),
                        new FileOutputStream("Modual20IOFlow2\\src\\c_IOStreamPackage\\工具包测试文本.txt"));


        // 静态方法:IOUtils.closeQuietly(任意流)悄悄释放资源,自动处理close方法抛出的异常
        FileWriter fw = null;
       fw=new FileWriter("\"Modual20IOFlow2\\\\src\\\\c_IOStreamPackage\\\\工具包测试文本.txt\")");
        fw.write("你好");

    }
}
