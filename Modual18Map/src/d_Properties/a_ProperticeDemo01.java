package d_Properties;

import java.util.Properties;
import java.util.Set;

public class a_ProperticeDemo01 {
    public static void main(String[] args) {
        Properties pts = new Properties();
        //    Object setProperty(String key, String value)
        //    存入键值对
        //    致电 Hashtable方法 put 。
    pts.setProperty("username","root");
    pts.setProperty("password","1234567890");
    System.out.println(pts);

        //    String getProperty(String key)
        //    通过key获取元素
        //    使用此属性列表中指定的键搜索属性。
        System.out.println("pts.getProperty(\"username\") = " + pts.getProperty("username"));

        //    Set<String> stringPropertyNames()
        //    获取所有key保存到set集合中
        //    返回此属性列表中的一组键，其中键及其对应的值为字符串，包括默认属性列表中的不同键，如果尚未从主属性列表中找到相同名称的键。
        Set<String> pt = pts.stringPropertyNames();
        //使用stringPropertyNames方法遍历Propertise集合元素
        System.out.println("pt = " + pt);
        for (String s : pt) {
            System.out.println(s);
        }
        //    void load(InputStream inStream)
        //    将流中的数据加载到properties集合中
        //    从输入字节流读取属性列表（键和元素对）。
    }
}
