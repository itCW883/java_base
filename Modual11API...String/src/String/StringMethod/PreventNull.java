package String.StringMethod;

import java.util.Objects;

public class PreventNull {
    public static void main(String[] args) {
        String s1=null;
        String s2="abc";
        //Objects工具类;自带判断两个对象(变量)是否相同,且预防空指针的方法
        System.out.println(Objects.equals(s1, s2));
        //预防空指针问题;不要用变量.方法,用一个确定的值去.方法
        System.out.println(s2.equals(s1));
    }
}
