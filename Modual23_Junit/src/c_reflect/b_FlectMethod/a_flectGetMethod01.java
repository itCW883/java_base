package c_reflect.b_FlectMethod;
import c_reflect.a_Flect.a_Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class a_flectGetMethod01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //method01();
       //method02();
        method03();
    }
//通过反射获取私有方法
    private static void method03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<a_Person> aClass = a_Person.class;
        a_Person aPerson = aClass.newInstance();
        Method method01 = aClass.getDeclaredMethod("method", String.class);
        Method[] declaredMethods = aClass.getDeclaredMethods();
        method01.setAccessible(true);//暴力反射


        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }


        method01.invoke(aPerson,"黑马给");

    }

    //获取所有的public修饰的指定的方法
    private static void method02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Class<a_Person> aClass = a_Person.class;
        Method method = aClass.getMethod("setName", String.class);
        a_Person aPerson = a_Person.class.newInstance();
        method.invoke(aPerson,"夏松马哥");
        System.out.println(aPerson);
        Method get = aClass.getMethod("getName");
        String invokeget = (String) get.invoke(aPerson);
        System.out.println(invokeget);
    }

    //获取所有的public修饰的方法(包含父类中的)
    private static void method01() {
        Method[] methods01 = a_Person.class.getMethods();
        for (Method method : methods01) {
            System.out.println(method);
        }
    }
}
