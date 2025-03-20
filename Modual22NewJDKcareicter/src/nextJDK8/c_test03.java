package nextJDK8;

import java.io.FileWriter;
import java.io.IOException;

public class c_test03 {
    public static void main(String[] args) throws IOException {
        method01();
        method02();
    }
/**
 * JDK9开始为减轻try的压力;可以将IO流读对象放到try外进行实例化
 * 依然可以刷新和自动关流
 * 目的:
 *      1:减轻try的压力
 *      2:自动刷新和关流
 *  缺点:
 *      实例化时会出现异常*/
    private static void method02() throws IOException {
        FileWriter fw = new FileWriter("Modual22NewJDKcareicter\\src\\nextJDK8\\test.txt",true);
        try(fw){
            fw.write("/n我是jdk9的新特性");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void method01() {
        try(FileWriter fileWriter = new FileWriter("Modual22NewJDKcareicter\\src\\nextJDK8\\test.txt",true)){
            fileWriter.write("瘦皮猴与马哥的爱恨情仇");

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
