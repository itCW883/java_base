package a_BufferFlow.e_PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class a_PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream
                (new FileOutputStream("Modual20IOFlow2\\src\\a_BufferFlow\\e_PrintStream\\z_打印流测试文件",true));
        printStream.println("鹅鹅鹅,曲项向天歌");
        printStream.println("白毛浮绿水,红掌拨清波");

        printStream.close();//所以流对象都要记得关流
    }
}
