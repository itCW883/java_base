package com.love;

public class RecrusionRevere {
    public static void main(String[] args) {
        int[] abc={1,2,3,4,5,6,7,8,9};
      int[] c =  arr(abc.length-1,0,abc);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
    public static int[] arr(int max,int min,int[] arry){
        if(max<=min){
            return arry;
        }
        else {
            int temp=arry[max];
            arry[max]=arry[min];
            arry[min]=temp;
            arr(max-1,++min,arry);
            return arry;
        }

    }
}
