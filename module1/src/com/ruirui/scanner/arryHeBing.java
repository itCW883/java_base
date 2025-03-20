package com.ruirui.scanner;

public class arryHeBing {
    public static void main(String[] args) {
        int arry1[]=new int[]{1,2,3,4,5};
        int arry2[]=new int[]{5,6,7,8,8};
        int arry3[]=new int[arry1.length+arry2.length];
        System.out.println(arry3.length);
        for (int i = 0; i < arry3.length; i++) {

            if (i<=arry1.length-1){
                arry3[i]=arry1[i];
            }
            else {
                arry3[i]=arry2[i-arry1.length];
            }
            System.out.printf(String.valueOf(arry3[i]));
        }
    }


}
