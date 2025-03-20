package com.love;

public class ArryRevers {
    public static void main(String[] args) {
        int[] fanZhuan={1,2,3,4,5,6,7,8,9};
        int jieSuo=0;
        int max=fanZhuan.length-1;
        int min=0;
        //for循环中每个部分可以写多个语句
        //for(int min=0,int max=length-1;max>min;min++,max--)
        for (int i = 0; i < fanZhuan.length; i++) {
            if(max<=min){
                break;
            }
            else{
                jieSuo=fanZhuan[min];
                fanZhuan[min]=fanZhuan[max];
                fanZhuan[max]=jieSuo;
                min++;
                max--;
            }
        }
        for (int i = 0; i < fanZhuan.length; i++) {
            System.out.println(fanZhuan[i]);

        }
    }
//    public static int[] arry(int[] arr){
//        int max=arr.length-1;
//        int min=0;
//        int a=0;
//
//        if (max<=min){
//            return arr;
//        }
//        a=arr[max];
//        arr[max]=arr[min];
//        arr[min]=a;
//        min++;
//        max--;
//        arry()
//    }
}
