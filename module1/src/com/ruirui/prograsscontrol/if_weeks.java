package com.ruirui.prograsscontrol;

import java.util.Scanner;

public class if_weeks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String week = scanner.next();
        if (week.equals("星期一")||week.equals("周一")){
            System.out.println("今天是 " + week);
        }
        else if (week.equals("星期二")||week.equals("周二")){
            System.out.println("今天是 " + week);
        }
        else if (week.equals("星期三")||week.equals("周三")){
            System.out.println("今天是 " + week);
        }
        else if (week.equals("星期四")||week.equals("周四")){
            System.out.println("今天是 " + week);
        }
        else if (week.equals("星期五")||week.equals("周五")){
            System.out.println("今天是 " + week);
        }
        else if (week.equals("星期六")||week.equals("周六")){
            System.out.println("今天是 " + week);
        }
        else if (week.equals("星期天")||week.equals("周日")){
            System.out.println("今天是 " + week);
        }
        else{
            System.out.println("一周没有这一天哦");
        }
    }
}
