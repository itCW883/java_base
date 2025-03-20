package a_BufferFlow.a_CharBufferFlow.a_ByteBufferFlow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class a_BufferdReaderDemo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Modual20IOFlow2\\src\\a_BufferFlow\\a_CharBufferFlow\\a_ByteBufferFlow\\test.txt",true);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        bufWriter.write("床前明月光");
        bufWriter.newLine();
        bufWriter.write("疑是地上霜");
        bufWriter.newLine();
        bufWriter.write("举头望明月");
        bufWriter.newLine();
        bufWriter.write("低头思故乡");
        bufWriter.newLine();
        bufWriter.close();//一定要close要不然数据一直在缓冲区


    }

}
