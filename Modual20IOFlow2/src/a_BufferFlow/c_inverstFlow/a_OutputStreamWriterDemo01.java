package a_BufferFlow.c_inverstFlow;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class a_OutputStreamWriterDemo01 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter opsw = new OutputStreamWriter
                (new FileOutputStream("Modual20IOFlow2\\src\\a_BufferFlow\\c_inverstFlow\\测试文本.txt",true),"gbk");
        //不指定编码规范默认传UTF-8
        opsw.write("你好呀");
        opsw.close();
    }

}
