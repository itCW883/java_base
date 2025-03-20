package c_reflect.c_flectFiled;
import c_reflect.a_Flect.a_Person;
import org.junit.Test;

import java.lang.reflect.Field;

public class a_FlectFiled01 {
    @Test
    public void GetFiled() throws Exception {

        Class<a_Person> aClass = a_Person.class;
        System.out.println("===========获取所有被public修饰的成员变量=========");
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("===========获取某个指定的被public修饰的成员变量=========");
        Field weight = aClass.getField("weight");
        System.out.println(weight);
        System.out.println("===========获取所有成员变量=========");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("===========获取某个指定的成员变量=========");
        Field name = aClass.getDeclaredField("name");
        System.out.println(name);
        System.out.println("===========使用反射为某个对象赋值,取值=========");
        a_Person aPerson = new a_Person();
        weight.set(aPerson,111);
        System.out.println(weight.get(aPerson));
    }
}
