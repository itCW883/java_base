package com.ruirui.scanner;

public class printjuxing {
    public static void main(String[] args) {
        int i=5;
        int j=5;
        for (int i1 = 0; i1 <=i; i1++) {
                if(i1==0||i1==i){
                    int k=0;
                    while(k<5){
                        System.out.printf("* ");
                        k++;
                    }
                    System.out.printf("*");
            }
                else {
                    for (int i2 = 0; i2 <= j; i2++) {
                        if (i2==0){
                            System.out.printf("* ");
                        }
                        else if (i2!=j){
                            System.out.printf("  ");
                        }
                        else System.out.printf("*");
                    }
                }
            System.out.println();

        }
    }
}
