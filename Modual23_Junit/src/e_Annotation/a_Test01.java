package e_Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

@SuppressWarnings("all")//消除所有警告
public class a_Test01 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Person person = new Person();
        person.eat();
        System.out.println("+++++++++++++++去除警告+++++++++++++");
        ArrayList objects = new ArrayList<>();
        objects.add(1);
        System.out.println("==========反射============");
        Class<Person> personClass = Person.class;
        Person person1 = personClass.newInstance();
        Method method = personClass.getMethod("eat");
        method.invoke(person1);
    }
}
