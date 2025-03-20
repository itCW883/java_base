package com.Exception;

public class ExceptionDemo03
{
    public static void main(String[] args) {
        Methoud("1.tx1t");
    }
    public static void Methoud(String s){
        if(!s.endsWith(".txt") //endsWith以什么结尾
         ){
            throw new NullPointerException();
        }
        System.out.println("我要执行");
    }
}
