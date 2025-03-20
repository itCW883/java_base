package com.Methoud;

public class Test {
    public static void main(String[] args) {
        FU fu = new FU();
        fu.MethoudFu();
        //fu.MethoudZi();  父类不能直接调用子类特有的方法
        fu.Methoud();
        System.out.println("===============================");
        Zi zi = new Zi();
        zi.MethoudZi();
        zi.MethoudFu();//子类继承后可以调用父类非私有成员
        zi.Methoud();


        //成员方法的访问特点new的是谁就用谁做的方法,子类没有会去寻找父类
        //多态也是如此
        System.out.println("==========成员方法的访问特点new的是谁就用谁做的方法,多态也是如此=========");
        FU fu1 = new Zi();
        fu1.Methoud();
    }
}
