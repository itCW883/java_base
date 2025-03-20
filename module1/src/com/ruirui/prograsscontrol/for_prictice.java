package com.ruirui.prograsscontrol;

public class for_prictice {
    public static void main(String[] args) {
        int i=0;
        for (int j = 1; j <4 ; j++) {
            i=i+j;//与i+=j相同
        }
        System.out.println(i);

        int sum=0;
        for (int i1 = 0; i1 <= 100; i1++) {
            if(i1%2==0){
                sum+=i1;
            }
        }
        System.out.println(sum);
        int a=0;
        for(int x=1;x<=100;x++){
            if(x%2==0){
                a++;
            }
        } System.out.println("a = " + a);
    }


}
