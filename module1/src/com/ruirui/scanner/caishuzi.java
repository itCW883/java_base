package com.ruirui.scanner;

import java.util.Random;
import java.util.Scanner;
/*猜大小*/
public class caishuzi {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int B=random.nextInt(0,5);

        while (true){

            int A=scanner.nextInt();
            if(A==B){
                System.out.println("\"猜对了啦\" = " + "猜对了啦");
                break;
            }
            else if (A>B){
                System.out.println("猜错了啦太大啦");
            }
            else  System.out.println("猜错了啦太小啦");
        }

    }
}
