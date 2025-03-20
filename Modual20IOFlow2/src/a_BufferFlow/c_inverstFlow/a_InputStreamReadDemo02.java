package a_BufferFlow.c_inverstFlow;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_InputStreamReadDemo02 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ipfr = new InputStreamReader
                (new FileInputStream("Modual20IOFlow2\\src\\a_BufferFlow\\c_inverstFlow\\测试文本.txt"),"GBK");
        int a;
        while((a=ipfr.read())!=-1){
            System.out.println((char)a);
        }
        ipfr.close();
    }

}
