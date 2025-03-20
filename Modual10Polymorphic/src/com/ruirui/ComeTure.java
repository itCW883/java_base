package com.ruirui;

public class ComeTure {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.Eat();//接收那个对象就调用那个对象重写的方法
        //dog.Play();报错因为多态不能直接调用子类特有的成员
        Animal cat = new Cat();
        cat.Eat();//接收那个对象就调用那个对象重写的方法
       // cat.CatchMouse();报错因为多态不能直接调用子类特有的成员
    }
}
