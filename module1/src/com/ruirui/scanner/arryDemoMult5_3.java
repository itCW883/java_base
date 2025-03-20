package com.ruirui.scanner;

import java.util.Random;

public class arryDemoMult5_3 {
    public static void main(String[] args) {
        Random random =new Random();
        random.nextInt(0,101);
        int arry[]=new int[10];
        for (int i = 0; i < arry.length; i++) {
            arry[i]=random.nextInt(0,11);
        }
      int count=0;
        for (int i = 0; i < arry.length; i++) {
            if(arry[i]%5==0&&arry[i]%3==0&&arry[i]%7!=0){
                count++;
                System.out.println("arry[i] = " + arry[i]);
            }
        }
        System.out.println("count = " + count);
    }
}
