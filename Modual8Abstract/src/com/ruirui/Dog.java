package com.ruirui;

public class Dog extends Animal{
    @Override
    public void eat() //重写的抽象方法不能带abstract关键字
     {
        System.out.println("狗啃骨头");
    }

    @Override
    public void Drink() {
        System.out.println("狗喝水");
    }
}
