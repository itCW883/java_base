package c_reflect.a_Flect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class a_getConstructsDemmo06 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取所有构造;无论private还是public
        Constructor<?>[] person1 = a_Person.class.getDeclaredConstructors();
        for (Constructor<?> constructor : person1) {
            System.out.println(constructor);
        }

        Constructor<a_Person> person2 = a_Person.class.getDeclaredConstructor(String.class);
        System.out.println(person2);
        //解除私有权限/暴力反射
        person2.setAccessible(true);//不解除是有权限;使用私有构造会报错 :IllegalAccessException
        a_Person aPerson = person2.newInstance("马哥麻瓜");
        //IllegalAccessException因为构造是私有的构造;所有外界正常情况无法使用;需要反射特殊材质

        System.out.println(aPerson);
    }
}
