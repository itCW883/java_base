package com.D_superthis;

public class Super {
    /*
    * super:代表父类引用
    *   作用:可以调用父类中的成员方法
    *   使用:1.调用父类构造方法
    *               必须在子类的构造中写super()[调用父类无参构造]或者super(...实参)[调用父类有参构造]
    *        2.调用父类成员变量
    *               super.成员变量名
    *        3.调用父类成员方法
    *               super.成员方法名(...实参...)*/
    int num=10;

    public Super() {
        System.out.println("我是父类中的无参构造");
    }

    public Super(int data) {
        System.out.println("我是父类中的有参构造");
    }
    public void Methoud(){
        System.out.println("我是父类中的method方法");
    }
    public static void Methoud02(){
        System.out.println("我是父类的一个静态方法Mehoud03");
    }
}
