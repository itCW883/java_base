package c_reflect.a_Flect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class a_getConstructsDemmo04 {
    @Test
    public void get1() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1:获取class对象
        Class<a_Person> aClass = a_Person.class;
        //2:获取所有指定的的构造方法
        //①获取空参构造
        Constructor<a_Person> constructor1 = aClass.getConstructor();

        //通过反射实例化对象(无参构造)
        a_Person aPerson = constructor1.newInstance();

        System.out.println(aPerson.toString());
        //②获取指定参数的构造
        Constructor<a_Person> constructor = aClass.getConstructor(String.class, Integer.class);
        a_Person aPerson1 = constructor.newInstance("瘦皮猴", 1000000000);
        System.out.println(aPerson1);


    }

}
