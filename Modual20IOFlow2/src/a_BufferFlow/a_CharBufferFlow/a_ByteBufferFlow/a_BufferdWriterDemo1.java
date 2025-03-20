package a_BufferFlow.a_CharBufferFlow.a_ByteBufferFlow;

import java.io.*;

public class a_BufferdWriterDemo1 {
    public static void main(String[] args) throws IOException {
        String flag;//局部变量后续如果用到可以在最初的时候不进行赋值
        BufferedReader bufReader = new BufferedReader(new FileReader("Modual20IOFlow2\\src\\a_BufferFlow\\a_CharBufferFlow\\a_ByteBufferFlow\\test.txt"));
        while((flag=bufReader.readLine())!=null){
            System.out.println(flag);
        }
        bufReader.close();//一定要记得关流
    }

}
