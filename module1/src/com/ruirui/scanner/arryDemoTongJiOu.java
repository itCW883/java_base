package com.ruirui.scanner;

import java.util.Random;

public class arryDemoTongJiOu {
    public static void main(String[] args) {
        int arry[]=new int[50];
        Random random=new Random();
        int count=0;
        for (int i = 0; i < arry.length; i++) {
            arry[i]=random.nextInt(100)+1;
            if(arry[i]%2==0){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
