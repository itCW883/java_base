package a_Junit;

import org.junit.Test;

public class a_JunitDemo03 {
    /**
     * 测试某个类中的某一个方法;解决传统新建类,实例化调用方法一次执行多个方法的问题*/
    @Test
    public void add(){
        a_Category acc = new a_Category();
        System.out.println(acc.add("水果"));
    }
    @Test
    public void findall(){
        a_Category acc = new a_Category();
        System.out.println(acc.findAllcatrgory());
    }
}
