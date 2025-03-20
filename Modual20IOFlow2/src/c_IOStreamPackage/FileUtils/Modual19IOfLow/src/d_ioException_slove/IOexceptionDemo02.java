package d_ioException_slove;

import java.io.FileWriter;
import java.io.IOException;

public class IOexceptionDemo02 {
    public static void main(String[] args) {
        try (FileWriter fw1 = new FileWriter("Modual19IOfLoor\\src\\d_ioException_slove\\文档.txt");){
            fw1.write("瘦皮猴大帅B\n");
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
