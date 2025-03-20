package com.ruirui.scanner;

import java.util.Scanner;

public class arryDemoPPei {
    public static void main(String[] args) {
        int arry[]=new int[]{1,7,3,45,6,7};
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int count=0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]==a){
                System.out.printf("a匹配的索引是"+i);
                count++;
            }
        }
        if (count==0){
            System.out.println( "没有找到匹配的数据哦");
        }
    }
}
