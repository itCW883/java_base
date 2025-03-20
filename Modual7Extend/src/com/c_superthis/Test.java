package com.c_superthis;

public class Test {
    public static void main(String[] args) {
        //创建子类对象是会先初始化父类
        /*原因:每个构造方法的第一行都会默认有一个super()[代表无参构造],super关键字代表父类引用
        * */
        Zi zi = new Zi();//会同时执行子类和父类的无参构造方法
        Zi zi1 = new Zi(10);//也会出现父类的无参构造

    }
}
