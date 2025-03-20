package a_BufferFlow.e_PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class a_PrintStreamD02 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream
                (new FileOutputStream("Modual20IOFlow2\\src\\a_BufferFlow\\e_PrintStream\\z_打印流测试文件",true));
        //这样传入FileOutputStream对象就可以完成打印流的续写

        //改变流向;向指定文件输出
        //先改变流向在进行输出;顺序不能错
        //改变流向的作用:可以将输出的内容和详细消息放入日志文件中永久保存
        System.setOut(printStream);

        System.out.println("这个错误时今天学到的");
        System.out.println("这个错误是文件意外到达结尾异常");



        printStream.close();//所以流对象都要记得关流
    }
}
