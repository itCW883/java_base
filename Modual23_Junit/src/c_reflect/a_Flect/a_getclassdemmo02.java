package c_reflect.a_Flect;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class a_getclassdemmo02 {
    @Test
    public void get1() throws ClassNotFoundException, IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("D:\\xue\\JAVA\\Project\\project1\\Modual23_Junit\\prop.properties");
        properties.load(fis);
        String className = properties.getProperty("className");
        Class<?> aClass = Class.forName(className);
        System.out.println("aClass = " + aClass);
    }

}
