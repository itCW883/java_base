package a_File;

import java.io.File;
import java.io.IOException;

public class a_FileDemo07 {
    public static void main(String[] args) throws IOException {

        File file1 = new File("D:\\短发睡姿\\嗨嗨嗨\\哼哼哼\\啦啦啦\\六六六");
        File file2 = new File("D:\\短发睡姿\\嗨嗨嗨\\哼哼哼\\啦啦啦\\六六六\\2.txt");
        boolean newFile = file2.createNewFile();
        //String[] list()
        //返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。
        //返回的是一个字符串数组;
        // 对这个字符串进行遍历时输出的是调用这个方法的File对象的最后一级目录包含的所有文件;并非是一条路径
        String[] bac1 = file1.list();//返回的是一个字符串数组;
                                     // 对这个字符串进行遍历时输出的是调用这个方法的File对象的最后一级目录包含的所有文件;并非是一条路径
        for (int i = 0; i < bac1.length; i++) {
            System.out.println("bac1[i] = " + bac1[i]);//1.txt
                                                       //2.txt
        }
        //File[] listFiles()
        //方法底层仍然是调用的list
        //返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
        //遍历会得到File对象的最后一级里面包含所有的文件的多条绝对路径
        File[] bac2 = file1.listFiles();
        for (File file : bac2) {
            System.out.println(file);//D:\短发睡姿\嗨嗨嗨\哼哼哼\啦啦啦\六六六\1.txt
                                     //D:\短发睡姿\嗨嗨嗨\哼哼哼\啦啦啦\六六六\2.txt
        }

    }


}
