package c_CharFloor;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class a_filerWriterDemo01 {
    public static void main(String[] args) throws IOException {

        method01();
       // method02();
    }

    private static void method01() throws IOException {

        FileWriter fw = new FileWriter("Modual19IOfLoor\\src\\b_ByteFloor\\a_2.txt",true);
        //void write(int c)
        // 写一个字符
        fw.write('马');
        // void write(char[] cbuf)
        // 写入一个字符数组。
        char[] chars = {'\n','一','次','传','人','一','个','子','符','数','组','马','哥','瘦','皮','猴','\n'};
        fw.write(chars);
        // abstract void write(char[] cbuf, int off, int len)
        // 写入字符数组的一部分。
        fw.write(chars,5,10);
        // void write(String str)
        // 写一个字符串
        String date ="一次传入一个字符串怒发冲冠凭栏处,潇潇雨歇抬望眼\n";
        fw.write(date);
        // void write(String str, int off, int len)
        // 写一个字符串的一部分。
        //len表示从其实元素开始传入多少个字符
        fw.write(date,4,15);

        //abstract void flush()
        //将缓冲区的数据刷到文件中
        fw.flush();//可以直接关闭;因为close也会将缓冲区中的数据刷到文件中

        // abstract void close()
        // 关闭流，先刷新
        fw.close();//必须要关闭数据才会写入文件中去
                    //原因:filewriter底层自带一个缓冲区;因此需要将缓冲区的数据刷到文件中



    }
    private static void method02() throws IOException {

    }
}
