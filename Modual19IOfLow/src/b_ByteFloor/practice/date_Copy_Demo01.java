package b_ByteFloor.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class date_Copy_Demo01 {
    public static void main(String[] args) throws IOException {
        Method001();
    }

    private static void Method001() throws IOException {
        File file = new File("D:\\短发睡姿\\图片\\宝贝.jpg");
        FileInputStream fiStream = new FileInputStream(file);
        FileOutputStream foStream = new FileOutputStream("D:\\短发睡姿\\图片\\宝贝2.jpg");
        //复制完的图片必需带名字
        byte[] bytes= new byte[102400];
       int len;

       while ((len = fiStream.read(bytes))!=-1){
           foStream.write(bytes,0,len);
       }
       //关流(先开的后关)
        foStream.close();
        fiStream.close();
    }
}
