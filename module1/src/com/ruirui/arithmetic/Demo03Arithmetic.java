package com.ruirui.arithmetic;

public class Demo03Arithmetic {
    public static void main(String[] args) {
            int i = 10;
            ++i;
            System.out.println("i = " + i);
            System.out.println("==============+++++++++==========");
            System.out.println("混合使用");
            System.out.println("符号在前=============================");
            int var2 = 100;
            ++var2;
            System.out.println("result = " + var2);
            System.out.println("j = " + var2);
            System.out.println("符号在后================");
            int var4 = 10;
            int var5 = var4++;
            System.out.println("result02 = " + var5);
            System.out.println("k = " + var4);
            System.out.println("==============+++++++++==========");
            int var6 = 10;
            int var7 = 20;
            int var10000 = var6++;
            --var7;
            var10000 += var7;
            ++var6;
            int var8 = var10000 + var6;
            System.out.println(var8);
            System.out.println("==============+++++++++==========");
            int var9 = 10;
            int var10 = var9++;
            System.out.println(var10);

    }

}
