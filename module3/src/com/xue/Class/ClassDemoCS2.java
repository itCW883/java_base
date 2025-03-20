package com.xue.Class;

public class ClassDemoCS2 {
    public static void main(String[] args) {
        Person2 reng=new Person2();
        reng.eat();
        reng.name="jiangwei";
        System.out.println(reng.name);

        System.out.println("+++++++++++++++++++====================+++++++++++++++++++");
        /*匿名对象*/
/*
* 注意:1.如果单纯调用一个方法,让方法执行,可以考虑匿名对象
*       2.如果设计到赋值,千万别用匿名对象*/
        new Person2().eat();
        System.out.println(new Person2().name = "vbnm");
    }

}
