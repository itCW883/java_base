package a_File;

import java.io.File;
import java.io.IOException;

public class a_FileDemo05 {
    public static void main(String[] args) throws IOException {

        fileDel();


    }

    private static void fileDel() {
        //boolean delete()
        //删除由此抽象路径名表示的文件或目录。
        //这个方法是彻底删除;不会进入回收站
        //如果删除文件夹必须是空文件夹
        File file1 = new File("D:\\短发睡姿\\嗨嗨嗨\\哼哼哼\\啦啦啦\\六六六");
        boolean delete = file1.delete();
        System.out.println(delete);
    }

}
