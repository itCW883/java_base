package String.StringMethod;

import java.util.Objects;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanne=new Scanner(System.in);
        System.out.println("请输入用户名和密码:");
        for (int i = 0; i < 3; i++) {
            if(LogIn(scanne.next(),scanne.next())==1){
                System.out.println("登录成功");
                break;
            }
            else {
                if(i!=2){
                    System.out.println("登陆失败,请重新登陆");
                }else
                    System.out.println("登录失败三次,该账号已被锁定");
            }
        }
    }



    public static int LogIn(String s1,String s2){
        String userName="王城";
        String passWord="wang0810";
        //预防空指针问题;不要用变量.方法,用一个确定的值去.方法
        //if(s1.equals(userName)&&s2.equals(passWord)){
        if(userName.equals(s1)&&passWord.equals(s2)){
            return 1;
        }
        return 0;
    }
    //Objects工具类;自带判断两个对象(变量)是否相同,且预防空指针的方法

    public static void Method(String s1,String s2){

    }
    public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }
}
