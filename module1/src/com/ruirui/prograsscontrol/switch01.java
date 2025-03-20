package com.ruirui.prograsscontrol;

import java.util.Random;
import java.util.Scanner;

public class switch01 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        Random random=new Random();
        int b=random.nextInt(10);
        /*switch的case必须有break要不然会一直向下执行到最后一个语句(case穿透)
        default:{System.out.println("我不在场上");}break;不一定要在case后可以在switch语句内的任意位置
        switch可以匹配byte short int char 枚举类型 string类型
        * */
        switch (a){
            case 1:{System.out.println("我是一号位");}break;
            case 2:{System.out.println("我是二号位");}break;
            case 3:{System.out.println("我是三号位");}break;
            case 4:{System.out.println("我是四号位");}break;
            case 5:{System.out.println("我是五号位");}break;
            default:{System.out.println("我不在场上");}break;

        }
        switch (b){
            case 1:{System.out.println("ramdom是一号位");}break;
            case 2:{System.out.println("ramdom是二号位");}break;
            case 3:{System.out.println("ramdom是三号位");}break;
            case 4:{System.out.println("ramdom是四号位");}break;
            case 5:{System.out.println("ramdom是五号位");}break;
            default:{System.out.println("ramdom是不在场上");}break;

        }
        //case穿透性优化代码
        switch (a){
            case 12:
            case 1:
            case 2:{System.out.println("冬季");}break;
            case 3:
            case 4:
            case 5:{System.out.println("春季");}break;
            case 6:
            case 7:
            case 8:{System.out.println("夏季");}break;
            case 9:
            case 10:
            case 11:{System.out.println("秋季");}break;
            default:{System.out.println("没有这个月份哦");}break;

        }
    }
}
