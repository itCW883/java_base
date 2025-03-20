package com.ruirui.prograsscontrol;

import java.util.Scanner;

public class if_ages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        if(age<0){
            System.out.println("怎么会有人的年龄是负数呢");
        }else{
            if (age>=0 && age<=6){
                System.out.println("他是一个婴儿哦");
            } else if (age>=7 && age<=12) {
                System.out.println("他是一个少儿哦");
            }
            else if (age>=13 && age<=17) {
                System.out.println("他是一个青少年哦");
            }
            else if (age>=18 && age<=45) {
                System.out.println("他是一个青年哦");
            }
            else if (age>=46 && age<=69) {
                System.out.println("他是一个中年哦");
            }
            else {
                System.out.println("他是一个老人哦");
            }
        }
    }
}
