package b_Properties;

import java.util.Properties;
import java.util.Set;

public class a_PropertiesDemo01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        Object o = properties.setProperty("uesrname", "Root");
        Object o1 = properties.setProperty("passWord", "123445");
        Set<String> st = properties.stringPropertyNames();
        for (String s : st) {
            System.out.println(properties.getProperty(s));
        }

    }
}
