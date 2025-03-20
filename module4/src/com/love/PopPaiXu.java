package com.love;

import java.util.Scanner;

public class PopPaiXu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        //int[] arr=new int[]{11,44,999,55,99,11};
        /*
         *冒泡排序
         *for (int i = 0; i < arr.length-1; i++)
         * {
        *  for (int j = 0; j <arr.length-1-j; j++)
        * .......循环体
        * }*/

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = arr.length-1; i >0 ; i--) {
            int jiaoHuan=0;
            for (int j = 0; j <i; j++) {
                if(arr[j]<arr[j+1])
                {
                    jiaoHuan=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=jiaoHuan;
            }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+",");
        }
    }


}
