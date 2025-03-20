package com.Exception;

public class ExceptionDemo07 {
    public static void main(String[] args) {
        int result=Method();
        System.out.println(result);
    }

    private static int Method() {
       try {
           String s = null;
           System.out.println(s.length());
           return 2;
       }catch (Exception e){
           return 1;
       }finally {
           System.out.println("我一定要执行");
           return 3;
       }
    }
}
