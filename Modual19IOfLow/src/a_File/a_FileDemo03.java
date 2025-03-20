package a_File;

import java.io.File;

public class a_FileDemo03 {
    public static void main(String[] args) {
      file01();
    }

    private static void file01() {
        //String getAbsolutePath()
        //获取File的绝对路径(带盘符的路径)名字符串。
        File file1 = new File("1.txt");//当前项目下
        System.out.println(file1.getAbsolutePath());

        //String getPath()
        //获取封装路径(实例化file对象时传什么路径就获取什么路径);并非相对路径
        System.out.println(file1.getPath());

        //String getName()
        //获取文件或目录的名称。
        //获取路径最后的那个部分
        File file2 = new File("D:\\短发睡姿\\李锐个人简历(1).pdf");
        System.out.println(file2.getName());

        //long length()
        //返回由此抽象路径名表示的文件的长度。
        //获取文件的长度指的是字节数
        System.out.println("file2.length() = " + file2.length());
        System.out.println("file1.length() = " + file1.length());

    }
}
