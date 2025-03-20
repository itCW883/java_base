package com.ruirui.scanner;

import java.util.Scanner;

public class arryDemoMax {
    public static void main(String[] args) {
        int arr1[]=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=scanner.nextInt();
        }
        int max=0;
        int port=0;
        for (int i = 0; i < arr1.length-1; i++) {
            if(arr1[i]>arr1[i+1]){
                max=arr1[i];
                port=i;
            }else{
                max=arr1[i+1];
                port=i+1;
            }
        }
        System.out.println("max = " + max+"索引为"+port);
    }
}
