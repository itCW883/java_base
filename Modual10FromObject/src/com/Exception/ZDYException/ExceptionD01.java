package com.Exception.ZDYException;

import java.util.Scanner;

public class ExceptionD01 {
    public static void main(String[] args) throws LoginUserException {
        String userName="王城";
        Scanner scanner =new Scanner(System.in);

        System.out.println("请您输入要登陆的用户名");
       String name =scanner.next();
       if(userName.equals(name)){
           System.out.println("登陆成功");
       }
       else {
           //直接写自定义的异常会报错;需要提前创建一个异常类
           throw new LoginUserException("用户名不匹配");
       }
    }
}
