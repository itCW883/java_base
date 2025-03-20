package com.ruirui;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Zi();
        System.out.println(fu.num);//1000 父类中的成员变量
        // 成员变量看左边,成员方法看右边
        fu.Methoud();//子类中的Methoud方法";成员方法具有多态性
    }
}
