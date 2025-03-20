package c_CharFloor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class a_filerReaderDemo01 {
    public static void main(String[] args) throws IOException {

        //method01();
        method02();
    }

    private static void method01() throws IOException {
        //int read()
        //一次读取一个字符返回的是int类型(读取字符对应的int值)
        FileReader frd = new FileReader("Modual19IOfLoor\\1.txt");
        System.out.println((char)frd.read());
        int len;
        while ((len=frd.read())!=-1){
            System.out.println((char)len);
        }
        frd.close();
    }
    private static void method02() throws IOException {
        FileReader frd = new FileReader("Modual19IOfLoor\\1.txt");
        char[] chars = new char[100];
       // int read = frd.read(chars);//数据已被存入字符数组中了
        int len;
        while ((len = frd.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
//        for (int i = 0; i < read; i++) {
//            System.out.println(chars[i]);
//        }
      frd.close();
    }
}
