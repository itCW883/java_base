package com.ruirui.prograsscontrol;

import java.util.Scanner;

public class ifyear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i = scanner.nextInt();
        if(i%4==0 && i%100!=0){
            System.out.println(i+"是闰年,今年二月有29天");
        }else  System.out.println(i+"是平年,今年二月有28天");
    }
}
