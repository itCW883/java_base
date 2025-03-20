package b_Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class a_PropertiesDemo02 {
    public static void main(String[] args) throws IOException {
        Properties pt = new Properties();
        FileInputStream fis = new FileInputStream("Modual20IOFlow2\\jdbc.properties");
        pt.load(fis);
        System.out.println(pt);

        Set<String> s = pt.stringPropertyNames();
        for (String string : s) {
            System.out.println(string+"..."+pt.getProperty(string));
        }

    }
}
