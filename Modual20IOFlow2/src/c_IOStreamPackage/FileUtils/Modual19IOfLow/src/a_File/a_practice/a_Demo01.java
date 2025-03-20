package a_File.a_practice;

import java.io.File;

public class a_Demo01 {
    public static void main(String[] args) {
        File file = new File("D:\\xue\\传感器\\作业\\图片");
        method(file);

    }

    private static void method(File file) {

        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                if(file1.getName().endsWith(".jpg")) {
                    System.out.println(file1);
                }
            }
            else {
                method(file1);
            }
        }
    }
}
