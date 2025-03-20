package com.cod;

public class Person {
    public Person() {
        System.out.println("我是无参构造方法");
    }
    //构造代码块
    //构造代码块每次都会优先于构造方法执行,new多少次对象就会执行多少次构造代码块
    {
        System.out.println("我是构造代码块");
    }
    //静态代码块
    //静态代码块优先于构造代码块执行,但是只会执行一次,无论new多少对象都只会执行一次
    static {
        System.out.println("我是静态代码块");
    }
}

