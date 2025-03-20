package com.ruirui;

public class test1 {
    //子类继承父类后不能使用父类私有成员(可以继承不能使用);
    public static void main(String[] args) {
        Techer techer = new Techer();
       techer.setAge(20);//继承的私有化属性不能直接使用,但是get,set方法是非私有的,可以间接使用私有属性
        techer.name="王城";
        techer.gongzuo="京东方";
        techer.work( techer.gongzuo,techer.name, techer.getAge());
        //通过构造方法间接调用私有的成员变量

        Manager manager1 = new Manager("京东方", "呃呃呃", 39);
        System.out.println(manager1.getGongzuo() + manager1.getName() + manager1.getAge());

        Manager ma = new Manager("wc", 1);
        System.out.println(ma.getName() + "....."+ma.getAge());
    }
}
