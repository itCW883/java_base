package com.a_extend;

public class Test {
    /*
    * 方法重写的使用场景:
    *       一般用于某些功能的升级改造
    * */
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.MethoudFu();
        fu.Methoud();
        System.out.println("=============");
        Zi zi=new Zi();
        zi.MethoudZi();
        zi.Methoud();
        System.out.println("=============");
        Fu fu1=new Zi();
        fu1.Methoud();
    }
}
