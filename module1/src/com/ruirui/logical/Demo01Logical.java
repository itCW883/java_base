package com.ruirui.logical;

public class Demo01Logical {
    public static void main(String[] args) {
        /*逻辑运算符:
        * 作用:连接多个Boolean结果
        * 结果为Boolean*/
        //&&:与,两边都为true,结果为true,否则为false 有假则假
        //||:或,两边只要有一个为true,结果为true,否则为false有真则真
        //!:非,取反,将true变为false,将false变为true
        //^:异或 相同为假,不同为真
        //&:与,两边都为true,结果为true,否则为false




        /*
        * &如果前后均为boolean型,和&&相同有假则假,如果前为false,符号后的判断会继续执行
        *                       如果该符号前是数字,看作是位运算
        * &&有假则假,但有短路效果,符号前为false符号后不执行*/
        int i=10;
        int j=20;
        int k=10;

        boolean b = (i > j) && (i == k);
        System.out.println(b);//false
        boolean b1 = (i > j) || (i == k);
        System.out.println(b1);//true
        boolean b2 = !(i > j);
        System.out.println(b2);//true
        boolean b3 = (i > j) ^ (i == k);
        System.out.println(b3);//true
        System.out.println("++++++++++======++++++++++");
//        boolean result01=(++i>100)&(++j>10);
//        System.out.println(result01);//false
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
        boolean result02=(++i>100)&&(++j>10);
        System.out.println(result02);//false
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        /*
        * |单或:1.有真则真,符号前是true,符号后依然会执行
        *       2.该符号前为数字则看作位运算符
        * ||双或:有真则真,但是有短路效果,如果符号前为true,符号后的判断就不会执行*/

        int q=10;
        int w=20;
        boolean q2 = (++q>10) || (++w<10);
        System.out.println("q2 = " + q2);
//        boolean q1 = (++q>10) | (++w<10);
//        System.out.println("q1 = " + q1);
        System.out.println("q = " + q);
        System.out.println("w = " + w);

        int e=200;
        boolean b4 = e >= 1 && e <= 100;
        System.out.println(b4);
        if(b4==false){
            System.out.println("e的值不满足条件");


            System.out.println("---------------------");
            //三元表达式/*
            // boolean表达式?表达式1:表达式2
            // 表达式1:如果表达式为true,返回表达式1的值
            // 表达式2:如果表达式为false,返回表达式2的值*/
            // */


        }






    }
}
