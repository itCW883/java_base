package com.D_superthis;
/*
* 继承注意:1.构造方法不能继承
*         2.私有方法可以继承不能重写
*                   不能使用
*         3.静态方法可以继承不能重写
*               静态方法可以继承使用
* */

public class Test {
    public static void main(String[] args) {
        This aThis = new This();
        System.out.println("===============");
        This aThis1 = new This(1);
        System.out.println("===============");
        This aThis2= new This();
        aThis2.Methoud();
        aThis2.Methoud02();//静态方法继承后可以使用
    }
}
