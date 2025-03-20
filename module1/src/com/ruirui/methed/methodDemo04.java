package com.ruirui.methed;

public class methodDemo04 {
    public static void main(String[] args) {
        int[] shuZu = fanHuiShuZu();
        for (int i = 0; i < shuZu.length; i++) {
            System.out.println(shuZu[i]);
        }
        int shuZU[]=method();
        for (int i = 0; i < shuZU.length; i++) {
            System.out.println(shuZU[i]);
        }

    }
    public static int[] fanHuiShuZu(){
        int returnShuZu[]=new int[]{1,2,3,4,5,6};
        return returnShuZu;
    }
    public static int[] method(){
        int a=10,b=20;
        int sum=a+b;
       int sub=a-b;
        int[] sumb={sum,sub};
        return sumb;
    }
}
