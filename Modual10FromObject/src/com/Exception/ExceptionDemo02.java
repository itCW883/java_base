package com.Exception;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Method(arr);
    }

    private static void Method(int[] arr) {
        System.out.println(arr[6]);//出现异常不进行处理,会一直向上throw最终到达虚拟机(jvm)虚拟机会向控制台打印异常信息并终止程序
        System.out.println("我想要执行");
    }
}
