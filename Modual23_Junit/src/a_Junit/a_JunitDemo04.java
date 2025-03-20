package a_Junit;

import org.junit.*;

public class a_JunitDemo04 {

@Test
    public void add(){
        System.out.println("我是@teat执行的add方法");
    }@Test
    public void delete(){
        System.out.println("我是@teat执行的deleted方法");
    }
    @BeforeClass//会先于@Test修饰的方法执行
    public static void methodBefore(){
        System.out.println("我是@BeforeClass执行的方法会先于@Test的方法执行");
    }
    @AfterClass//会后于@Test修饰的方法执行
    public static void methodAfter(){
        System.out.println("我是 @AfterClass执行的方法会后于@Test的方法执行");
    }
}
