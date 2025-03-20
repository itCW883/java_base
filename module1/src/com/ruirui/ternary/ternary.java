package com.ruirui.ternary;

public class ternary {
    public static void main(String[] args) {
        //三元表达式/*
        // boolean表达式?表达式1:表达式2
        // 表达式1:如果表达式为true,返回表达式1的值
        // 表达式2:如果表达式为false,返回表达式2的值*/
        // */
        int score=59;
        String result=score>=60?"及格":"不及格";
        System.out.println("result = " + result);


        int a=70;
        int b=80;
        String ordage=a>b?"张三":"李四";
        System.out.println("oldage = " + ordage);
        int c=60;
        //三元运算符只能两两比较
        int d=a>b?a:b;
        int e=c>d?c:d;
        System.out.println("e = " + e);
        System.out.println("+++++++++++++++++++++++++====================+++++++++");
        System.out.println("scanner");
        /*使用java类
        * 1.导包*/



    }
}
