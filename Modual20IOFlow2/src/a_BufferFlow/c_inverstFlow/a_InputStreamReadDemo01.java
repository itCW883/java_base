package a_BufferFlow.c_inverstFlow;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class  a_InputStreamReadDemo01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("Modual20IOFlow2\\src\\a_BufferFlow\\c_inverstFlow\\转换流.txt");
        System.out.println(fileReader.read());

        //转换流可以指定编码读取



        fileReader.close();


    }

}
