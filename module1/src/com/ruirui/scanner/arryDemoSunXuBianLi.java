package com.ruirui.scanner;

public class arryDemoSunXuBianLi {
    public static void main(String[] args) {
        int arry[]=new int[]{1,2,3,4,5};
        System.out.printf("[");
        for (int i = 0; i < arry.length; i++) {
           if(i!= arry.length-1){
               System.out.printf(arry[i]+",");
           }
           else {
               System.out.printf(arry[i]+"]");
           }
        }

    }
}
