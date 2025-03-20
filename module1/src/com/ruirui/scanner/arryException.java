package com.ruirui.scanner;

public class arryException {
    public static void main(String[] args) {
        int arry1[]=new int[]{1,2,3,4,5};
        int arry2[]=new int[arry1.length+5];
        for (int i = 0; i < arry1.length; i++) {
            arry2[i]=arry1[i];
        }
        arry2[7]=9;
        arry1=arry2;
        System.out.println(arry1[7]);
        System.out.println("arry1的长度 = " + arry1.length);
    }
}
