package com.E_superthis;
/*
* 无论super还是this都必须在第一行使用,因此不能同时手写出来
* */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("===============");
        Person person1 = new Person(10);
    }
}
