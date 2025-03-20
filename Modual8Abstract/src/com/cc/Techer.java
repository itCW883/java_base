package com.cc;

public class Techer extends Employee{
    public Techer(String name, int age) {
        //通过super找到抽象父类的构造方法
        super(name, age);
    }

    public Techer(String name) {
        super(name);
    }

    public Techer(int age) {
        super(age);
    }

    @Override
    public void work() {
        System.out.println("老师的工作是教书育人");
    }
}
