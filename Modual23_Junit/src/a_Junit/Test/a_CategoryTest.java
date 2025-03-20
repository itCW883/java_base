package a_Junit.Test;

import a_Junit.a_Category;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a_CategoryTest {
    @Test
    public void Testa_Category() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<a_Category> aCategoryClass = a_Category.class;
        a_Category aCategory = aCategoryClass.newInstance();
        Method method = aCategoryClass.getMethod("findAllcatrgory");
        ArrayList<String> invoke = (ArrayList<String>) method.invoke(aCategory);
        Iterator<String> iterator = invoke.iterator();
        ArrayList<String> a = new ArrayList<String>();
        a.add("蔬菜");
        a.add("水果");
        a.add("服装");
        a.add("家电");
        //a.add("汽车");
        Assert.assertEquals(a,invoke);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
