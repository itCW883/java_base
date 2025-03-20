package d_FlectPractice;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class a_practice01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1:创建properties集合
        Properties properties = new Properties();

//        2:读取配置文件;解析配置文件
//        ①问题:out路径下没有resources文件
//         解决:用类加载器
//           tClassLoader classloader = 当前类.class.getClassLoader
//           InputStream in =  classloader.getResourceAsStream("文件名")//会自动扫描,resources下的文件
        ClassLoader loader = a_practice01.class.getClassLoader();//获取类加载器
        InputStream resourceAsStream = loader.getResourceAsStream("prop.properties");//获取资源字节流

        //将流中的数据加载到properties集合中
        //加载配置文件
        properties.load(resourceAsStream);

//    3:根据解析出的classname创建class对象(获取配置文件)
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        //创建class对象
        Class<?> aClass = Class.forName(className);//加载properties类进内存
        Object o = aClass.newInstance();

//    4:根据解析出的MethodName,获取对应的方法
//根据方法名获取方法
        Method method = aClass.getMethod(methodName);


        /*
        *
        * java中某个地方使用了全类名;要意识到使用的是反射机制
        *
        * */
//    5:执行方法
        method.invoke(o);
    }
}
