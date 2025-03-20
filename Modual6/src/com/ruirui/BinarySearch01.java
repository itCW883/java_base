package com.ruirui;

public class BinarySearch01 {
    public static void main(String[] args) {
        int arry[]={1,2,3,4,5,7,8,9};
      int result = BinarySerach(arry,10);
        System.out.println(result);
    }
    public static int BinarySerach(int[] arry,int key){
        int left=0;
        int right=arry.length;
        while (left<right-left){
            int mid=(left+right)>>>1;
            if(arry[mid]>key){
                right=mid;
            }
            else {
                left=mid;
            }
        }
        if(arry[left]==key){
            return left;
        }
        else return -1;


    }
}
