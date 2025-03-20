package com.Exception.ZDYException;

import java.util.Scanner;

public class ExceptionD02 {
    public static void main(String[] args) {
        String userName="王城";
        Scanner scanner =new Scanner(System.in);

        System.out.println("请您输入要登陆的用户名");
       String name =scanner.next();
       if(userName.equals(name)){
           System.out.println("登陆成功");
       }
       else {
           //直接写自定义的异常会报错;需要提前创建一个异常类
           try {
               throw new LoginUserException("用户名不匹配");
           } catch (LoginUserException e) {
               //System.out.println(e.toString());//输出的是异常类型和设置的异常信息
               //System.out.println(e.getMessage());//只有设置的异常信息
               e.printStackTrace();//com.Exception.ZDYException.LoginUserException: 用户名不匹配
                                    //at com.Exception.ZDYException.ExceptionD02.main(ExceptionD02.java:18)
                                    //打印包括异常类型,信息,行数
           }
       }
    }
}
