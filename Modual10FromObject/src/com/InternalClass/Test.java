package com.InternalClass;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        System.out.println("===================");
        // 静态内部类成员调用
        // 外部类.内部类 对象名 = new 外部内.内部类();
        Person.Heart heart = new Person.Heart();
        heart.setMaiB(100);
        System.out.println("你的心跳是每分钟"+heart.getMaiB()+"次");
        heart.XingT();
        System.out.println("===================");
        // 非静态内部类成员调用
        //外部类.内部类 对象名 = new 外部内().new 内部类();
        Person.Hand hand=new Person().new Hand();
        hand.XiShou();
    }
}
