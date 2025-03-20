package com.E_superthis;

public class Person {
    int num=10;

    public Person() {
        //this(10);无参构造调用有参构造
        System.out.println("我是person中的无参构造");
        System.out.println("==============");
        System.out.println("我是成员变量num:   "+this.num);//输出成员变量
        System.out.println("+++++++++++++++++");
        Method();//非静态方法可以直接调用非静态方法;所以不用写this
        Method02();
    }

    public Person(int data) {
        //this();无参构造调用有参构造
        System.out.println("我是person中的有参构造");
    }
    public void Method(){
        int num=1000;
        System.out.println("我是person类中的method方法");
        System.out.println("我是局部变量num:   "+num);//输出局部变量
    }
    public void Method01(){
        System.out.println("我是person类中的method01方法");
    }
    public static void Method02(){
        System.out.println("我是person类中的method02方法");
    }
    public static void Method03(){
        System.out.println("我是person类中的method03方法");
    }
}
