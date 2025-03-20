package d_ioException_slove;

import java.io.FileWriter;
import java.io.IOException;

public class IOexceptionDemo01 {
    public static void main(String[] args) {
        FileWriter fw1 = null;
        //如果实例化的FileWriter对象不为null该对象才被实例化成功了;这个FileWriter类的实例化对象才需要关闭
        if (fw1 != null){
            try {
                fw1 =new FileWriter("Modual19IOfLoor\\src\\b_ByteFloor\\a_3.txt");
                fw1.write("你好\n");

            }
            catch (Exception e){
                e.printStackTrace();
            }
            finally {
                try {
                    fw1.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
