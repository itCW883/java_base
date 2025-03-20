package b_ClassLoader;

import org.apache.commons.io.FileUtils;

public class a_ClassLoader01 {
    public static void main(String[] args) {
        app();
        //ext();
        //boot();

    }
/**
 * 负责加载核心类rt.jar包中的类
 * BootStrapClassLoader c语言编写未开源*/
    private static void boot() {
        ClassLoader classLoader = System.class.getClassLoader();
        System.out.println(classLoader);

    }

    /**
 * 扩展类加载器;负责加载扩展类;jar包下ext目录中的类*/
    private static void ext() {

    }

    /**
 * 用于加载class文件,自定义类和第三方jar包的类*/
    private static void app() {
        ClassLoader cl = a_ClassLoader01.class.getClassLoader();
        System.out.println(cl);
        System.out.println(cl.getParent());
        ClassLoader classLoader = FileUtils.class.getClassLoader();
        System.out.println(classLoader);
        ClassLoader parent = classLoader.getParent();
        System.out.println("parent = " + parent);
    }
}
