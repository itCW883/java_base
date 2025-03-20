package com.ruirui.scanner;

public class arryCopy {
    public static void main(String[] args) {
        int arry[]=new int[]{1,2,3,4,5};
        int arry1[]=new int[arry.length];
        for (int i = 0; i < arry.length; i++) {
            arry1[i]=arry[i];
            System.out.println(arry1[i]);
        }
    }
}
