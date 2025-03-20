package com.xue.Class;

public class Person {
    /*成员变量*/
 String name;
 int age;
 double height;
 double weight;
 /*成员方法*/
    public void eat(boolean tag){
        if (tag){
            System.out.println("吃饱啦");
        }else System.out.println("没吃饱啦");
    }
    public void drink(){
        System.out.println("我要喝水");
    }
}

