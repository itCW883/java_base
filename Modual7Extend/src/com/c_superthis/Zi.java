package com.c_superthis;

public class Zi extends Fu{

    public Zi() {
        super();//手写super关键字必须在第一行,
        System.out.println("我是子类中的无参构造");
    }
    public Zi(int n){
        System.out.println("我是子类中的有参构造");
    }
}
