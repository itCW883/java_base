package a_BufferFlow.a_ByteBufferFlow;

import java.io.*;

public class a_BufferdOutPutStream_InputStream {
    public static void main(String[] args) throws IOException {
        methoud01();
        methoud02();
    }

    private static void methoud02() throws IOException {
        long star = System.currentTimeMillis();

        //1:实例化基本流对象

        FileInputStream fis1 = new FileInputStream("D:\\短发睡姿\\王城简历.docx");
        FileOutputStream fos1 = new FileOutputStream("D:\\短发睡姿\\王城简历copy.docx");
        BufferedInputStream bis1 = new BufferedInputStream(fis1);
        BufferedOutputStream bos1 = new BufferedOutputStream(fos1);

        int len;
        while ((len=bis1.read())!=-1){

            bos1.write(len);
        }

        long end = System.currentTimeMillis();
        System.out.println(end-star);
        bos1.close();
        bis1.close();
        //只需要关闭缓冲流就可以
    }

    private static void methoud01() throws IOException {
        //获取毫秒值;查看执行效率
        long star = System.currentTimeMillis();

        //1:实例化基本流对象

        FileInputStream fis1 = new FileInputStream("D:\\短发睡姿\\王城简历.docx");
        FileOutputStream fos1 = new FileOutputStream("D:\\短发睡姿\\王城简历copy.docx");
        int len;
        while ((len=fis1.read())!=-1){

            fos1.write(len);
        }

        long end = System.currentTimeMillis();
        System.out.println(end-star);
        fos1.close();
        fis1.close();
    }
}
