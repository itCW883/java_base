package c_reflect.a_Flect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class a_getConstructsDemmo03 {
    @Test
    public void get1()  {
        //1:获取class对象
        Class<a_Person> aClass = a_Person.class;
        //2:获取所有public的构造方法
        Constructor<?>[] aClassConstructors = aClass.getConstructors();
        for (Constructor<?> aClassConstructor : aClassConstructors) {
            System.out.println(aClassConstructor);
        }
    }

}
