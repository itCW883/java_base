package com.ruirui.prograsscontrol;

public class while01 {
    public static void main(String[] args) {
        int x = 0;
        while (x<5){
            System.out.println("我爱Java"+x);
            x++;
        }
        int a=0;
        int i=0;
        while(i<=3){
            a+=i;
           i++;
        } System.out.println("a = " + a);
        int j=0;
        int sum=0;
        while (j<=100){
            if (j%2==0)
            {
                sum+=j;
            }
            j++;
        }
        System.out.println("sum = " + sum);
        int count = 0;
        int f=1;
        while (f<=100){
            if (f%2==0)
            {
                count++;
            }
            f++;
        }
        System.out.println(count);
    }
}
