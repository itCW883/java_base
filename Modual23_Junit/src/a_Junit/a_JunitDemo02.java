package a_Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class a_JunitDemo02 {

@Test
    public void add(){
        System.out.println("我是@teat执行的add方法");
    }@Test
    public void delete(){
        System.out.println("我是@teat执行的deleted方法");
    }
    @Before//会先于@Test修饰的方法执行
    public void methodBefore(){
        System.out.println("我是@Before执行的方法");
    }
    @After//会后于@Test修饰的方法执行
    public void methodAfter(){
        System.out.println("我是@After执行的方法");
    }
}
