package com.ruirui.scanner;

import java.util.Scanner;

public class scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        int i = scanner.nextInt();
        String next1 = scanner.next();
        int i1 = scanner.nextInt();
        String next2 = scanner.next();
        int i2 = scanner.nextInt();
        int temp =i>i1?i:i1;
        int temp1 =i2>temp?i2:temp;
        if (temp1==i){
            System.out.println(next);
        }
        else if (temp1==i1){
            System.out.println(next1);
        }else
        {
            System.out.println("next2 = " + next2);
        }


    }


}
