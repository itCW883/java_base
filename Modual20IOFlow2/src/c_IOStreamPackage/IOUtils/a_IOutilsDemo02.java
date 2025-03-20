package c_IOStreamPackage.IOUtils;

import org.apache.commons.io.IOUtils;

import java.io.FileWriter;
import java.io.IOException;

public class a_IOutilsDemo02 {
    public static void main(String[] args) {
        // 静态方法:IOUtils.closeQuietly(任意流)悄悄释放资源,自动处理close方法抛出的异常
        FileWriter fw = null;
        try {
            fw=new FileWriter("Modual20IOFlow2\\src\\c_IOStreamPackage\\工具包测试文本.txt");
            fw.write("你好");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fw!=null){
                IOUtils.closeQuietly(fw);
            }
        }
//        finally {
//            try {
//                fw.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }可以被代替


    }
}
