package com.xue.Class;
/*
* 如果两个类在同一个包下,想使用对方的类不需要导包
* */
public class ClassDemo01 {
    public static void main(String[] args) {
        Person person=new Person();
        String name=person.name="李锐锐";
        System.out.println(name);
        person.eat(false);
        System.out.println(person.height);
    }
}
