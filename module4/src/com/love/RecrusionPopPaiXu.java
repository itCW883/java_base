//package com.love;
//
//public class RecrusionPopPaiXu {
//    public static void main(String[] args) {
//        int[] pop=new int[]{11,44,999,55,99,11};
//        int[] a= PopPaiXu(pop,pop.length-1);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//    }
//    public static int[] PopPaiXu(int[] arry,int length) {
//        if (length == 0)
//            return;
//            for (int i = 0; i < length; i++) {
//                int a = 0;
//                if (arry[i] < arry[i + 1]) {
//                    a = arry[i];
//                    arry[i] = arry[i + 1];
//                    arry[i + 1] = a;
//                }
//
//            }
//            PopPaiXu(arry, length - 1);
//    }
