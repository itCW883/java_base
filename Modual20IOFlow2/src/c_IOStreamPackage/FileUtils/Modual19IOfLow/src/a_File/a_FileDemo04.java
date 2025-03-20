package a_File;

import java.io.File;
import java.io.IOException;

public class a_FileDemo04 {
    public static void main(String[] args) throws IOException {
      fileccreate();



    }

    private static void fileccreate() throws IOException {
        //boolean createNewFile()
        //当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
        //创建文件;返回值类型是boolea指的是创建的文件如果之前有就会创建失败就会返回false;否则返回true创建成功
        File file2 = new File("D:\\短发睡姿\\1.txt");
        boolean newFile1 = file2.createNewFile();
        System.out.println("newFile1 = " + newFile1);

        //boolean mkdirs()
        //创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
        //创建文件夹;既可以创建单级文件夹;也可以创建多级文件夹
        //如果要创建的文件夹之前有就会创建失败返回false;否则返回true创建成功
        File file1 = new File("D:\\短发睡姿\\嗨嗨嗨\\哼哼哼\\啦啦啦\\六六六");
        boolean mkdirs = file1.mkdirs();
        System.out.println("mkdirs = " + mkdirs);
//boolean delete()
//删除由此抽象路径名表示的文件或目录。
    }

}
