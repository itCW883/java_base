package com.a_extend;

import java.lang.reflect.Method;

public class Fu {
    //1.方法的重写:子类中有一个和和父类方法名以及参数列表相同的方法;
    //      2.必须是继承父类
    //      3.访问特点:new的是谁先调用谁的方法(new 子类,先调用子类重写的方法,子类没有找父类
    //      4.方法是否为重写,在方法上写一个注解@override(报错就不是重写的方法)
    public void MethoudFu(){

        System.out.println("我是父类中的MethoudFu方法");
    }
    public void Methoud(){
        System.out.println("我是父类中的Methoud方法");
    }
    public void Methoud1(){
        System.out.println("我是子类中的Methoud方法");
    }
    public static void Method02(){

    }
    public Fu Method03(){
            return null;
    }

    public Zi Method04(){
        return null;
    }
}
