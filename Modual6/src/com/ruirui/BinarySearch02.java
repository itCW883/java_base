package com.ruirui;

import java.util.Scanner;

public class BinarySearch02 {
    public static void main(String[] args) {
        int [] arry ={1,3,5,5,5,5,5,6};
        int target=5;
        int key= BinarySearch02(arry,target);
        System.out.println(key);
        int b=BinarySearch03(arry,target);
        System.out.println(b);
        String result=BinarySearch04(arry,1);
        System.out.println(result);
    }
    //leftmost
    public static int BinarySearch02(int[] arry,int target){
        int left=0;
        int right=arry.length-1;
        int tag=-1;
        while (left<=right){
            int mid=(left+right)>>>1;
            if(arry[mid]>target){
                right=mid-1;
            }
            else if (arry[mid]<target){
                left=mid+1;
            }
            else{
                tag=mid;
               right=mid-1;
            }
        }
        return tag;
    }
    //rightmost
    public static int BinarySearch03(int[] arry,int target){
        int left=0;
        int right=arry.length-1;
        int tag=-1;
        while (left<=right){
            int mid=(left+right)>>>1;
            if(arry[mid]>target){
                right=mid-1;
            }
            else if (arry[mid]<target){
                left=mid+1;
            }
            else{
                tag=mid;
                left=mid+1;
            }
        }
        return tag;

    }
    public static String BinarySearch04(int[] arry,int target){
       int a= BinarySearch02(arry,target);
       int b= BinarySearch03(arry,target);
       String c="["+a+","+b+"]";
       return c;
    }
}
