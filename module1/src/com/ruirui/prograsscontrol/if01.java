package com.ruirui.prograsscontrol;

import java.util.Random;
import java.util.Scanner;

public class if01 {
    public static void main(String[] args) {
        if (true){
            System.out.println("false");
        }
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
//        java中if的判断条件不可以直接是字符串:要使用变量.equals
        if(next.equals("李锐"))
        {
            System.out.println("李锐爱王城");
        }
        else {System.out.println("王城也爱李锐");}
        Random random=new Random();
        int i = random.nextInt();
        System.out.println("random i = " + i);
        if (i%2==0){
            System.out.println("这是一个整数");
        }else {
            System.out.println("这是一个奇数");
        }
/*最后一种情况不一定要用else,但是说有情况必须判断完*/
        if(i1>i2&&i1>i3){
            System.out.println("i1 = " + i1);
        } else if (i1<i2&&i>i3){
            System.out.println("i2 = " + i2);
        }
        else System.out.println("i3 = " + i3);

    }
}
