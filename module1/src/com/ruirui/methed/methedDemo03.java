package com.ruirui.methed;

import java.util.Scanner;

public class methedDemo03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("=============判断奇数偶数===============");
        System.out.println(panDuanJiOu(scanner.nextInt()));
        System.out.println("=============100求和===============");
        int he=qiuHe();
        System.out.println(he);
        System.out.println("============自定义次数循环打印================");
        int ciShu=scanner.nextInt();
        print(ciShu);
        System.out.println("============使用方法遍历数组================");
        String fFBianLi[]={"孙悟空","周帮金","黄功勋","雷文杰","蒋伟"};
        bianLiShuZu(fFBianLi);
    }
    public static String panDuanJiOu(int a){
        if(a%2==0){
            return "偶数";
        }else  return "奇数";
    }
    public static int qiuHe(){
        int sum=0;
        for (int i = 1; i < 101; i++) {
           sum+=i;
        }
        return sum;
    }
    public static void print(int ciShu){
        for (int i = 0; i < ciShu; i++) {
            System.out.println("我是一个有经验的JAVA开发师");
        }
    }
    public static void bianLiShuZu(String shuZu[]){
        for (int i = 0; i < shuZu.length; i++) {
            System.out.println(shuZu[i]);
        }
    }
}
