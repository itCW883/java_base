package a_File;

import java.io.File;
import java.io.IOException;

public class a_FileDemo06 {
    public static void main(String[] args) throws IOException {

        file6();


    }

    private static void file6() throws IOException {
        File file1 = new File("D:\\短发睡姿\\嗨嗨嗨\\哼哼哼\\啦啦啦\\六六六\\1.txt");
        boolean newFile = file1.createNewFile();
        //boolean isDirectory()
        //测试此抽象路径名表示的文件是否为目录。
        boolean directory = file1.isDirectory();
        System.out.println("directory = " + directory);

        //boolean isFile()
        //测试此抽象路径名表示的文件是否为普通文件。
        System.out.println("file1.isFile() = " + file1.isFile());

        //boolean exists()
        //测试此抽象路径名表示的文件或目录是否存在。
        System.out.println("file1.exists() = " + file1.exists());
    }







}
