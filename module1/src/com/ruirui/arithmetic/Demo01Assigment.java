package com.ruirui.arithmetic;

public class Demo01Assigment {
    public static void main(String[] args) {
        int i=10;
        i+=2;//约等于i=i+2
        byte b=10;
//        b=b+1;byte型等号右边有变量参与运算,自动转换为int型
        //byte,short遇见复合赋值运算,jvm会自动转型
        b=(byte)(b+1);
        System.out.println(b);
        System.out.println(i);
        System.out.println("++++++++++++");
        i-=2;
        System.out.println(i);
        System.out.println("-----------");
        i/=2;
        System.out.println(i);
        System.out.println("/////////////");
        i*=2;
        System.out.println(i);
        System.out.println("***********");
        i%=2;
        System.out.println(i);
        System.out.println("%%%%%%%%%%%");
    }
}
