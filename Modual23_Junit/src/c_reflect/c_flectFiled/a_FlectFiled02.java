package c_reflect.c_flectFiled;
import c_reflect.a_Flect.a_Person;
import org.junit.Test;

import java.lang.reflect.Field;

public class a_FlectFiled02 {
    @Test
    public void GetFiled() throws NoSuchFieldException, IllegalAccessException, InstantiationException {

        Class<a_Person> aClass = a_Person.class;
        a_Person aPerson = aClass.newInstance();
        System.out.println("===========获取所有被public修饰的成员变量=========");
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("===========获取某个指定的被public修饰的成员变量=========");
        Field weight = aClass.getField("weight");
        System.out.println(weight);
        weight.set(aPerson,1000);
        System.out.println(weight.get(aPerson));
        System.out.println("===========获取所有成员变量=========");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("===========获取某个指定的成员变量=========");
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name);
        name.set(aPerson,"瘦皮猴");
        System.out.println(name.get(aPerson));
    }

}
