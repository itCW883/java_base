package c_reflect.a_Flect;

import org.junit.Test;

public class a_getConstructsDemmo05 {
    @Test
    public void get1() throws InstantiationException, IllegalAccessException {
        a_Person aPerson = a_Person.class.newInstance();
        System.out.println(aPerson.toString());
    }

}
