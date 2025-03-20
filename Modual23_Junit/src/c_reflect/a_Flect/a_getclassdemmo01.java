package c_reflect.a_Flect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class a_getclassdemmo01 {
    @Test
    public void get1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("============获取class对象的方式一==============");
        /**
         * 方式1:调用Object中的getClass方法
         *     Class<?> getClass()
         *     返回此 Object的运行时类。*/
        a_Person people = new a_Person();
        Class<? extends a_Person> aClass1 = people.getClass();
        System.out.println("aClass1 = " + aClass1);
        System.out.println("============获取class对象的方式二==============");
        /**
         * 基本类型还是引用类型;jvm虚拟机都为它们提供了一个静态成员:class*/
        Class<a_Person> class2 = a_Person.class;
        System.out.println("class2 = " + class2);
        System.out.println("============获取class对象的方式二==============");
        /**
         *Class类中的静态方法
         *         static Class<?> forName(String className)
         *         返回与给定字符串名称的类或接口相关联的 类对象。*/
        Class<?> aClass3 = Class.forName("c_reflect.a_Flect.a_Person");
        System.out.println("aClass3 = " + aClass3);
        /**
         * 写类的全限定名技巧:
         * 1:直接复制类的路径
         * 2:直接类名+回车
         * 检查:
         *  ctr+鼠标左键点击类名;可以跳转到对应的类;就表示全限定名写成功啦
         * */
        System.out.println( (aClass1 == aClass3));// true
        /**类加载器只会加载一个class对象*/


        Constructor<a_Person> constructor = class2.getDeclaredConstructor(String.class);
        int modifiers = constructor.getModifiers();
        Parameter[] parameters = constructor.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        System.out.println(modifiers);

        constructor.setAccessible(true);
        a_Person aPerson = constructor.newInstance("sbc");


        System.out.println(aPerson);
   /*     a_Person aPerson1 = constructor.newInstance("abc");
        System.out.println(aPerson1);
        a_Person aPerson = a_Person.class.newInstance();
        System.out.println(aPerson);
*/
    }

}
