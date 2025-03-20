package com.ruirui.arithmetic;

public class Demo01Arithmetic {
    public static void main(String[] args) {
        int i = 10;
        double j = 3.0;
        double add = i + j;
        System.out.println("add = " + add);
        double sub = i - j;
        System.out.println("sub = " + sub);
        double mul = i * j;
        System.out.println("mul = " + mul);
        double div = i / j;
        System.out.println("div = " + div);
        double mo = i % j;
        System.out.println("mo = " + mo);
//+  1.运算加,2.字符串拼接(任何类型数据遇见字符串都会变成字符串),将内容直接连接
        String a="lirui";
        System.out.println(div+"字符串"+a);

    }

}
