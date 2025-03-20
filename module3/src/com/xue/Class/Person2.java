package com.xue.Class;

public class Person2 {
    String name;
    public void eat(){
        System.out.println("人要吃饭");
    }
    /*
    * 类中方法加上static关键字类名可以直接访问方法
    * */
    public static void Drink(){
        System.out.println("人要喝水");
    }
}
