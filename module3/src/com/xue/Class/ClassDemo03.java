package com.xue.Class;

public class ClassDemo03 {
    public static void main(String[] args) {
       double a= SellMelom(1.9,16,0.75);
        System.out.println(a);
    }
    public static double SellMelom(double price,int count,double discount)
    {
       double totalPrice=price*count;
       int totalTen=0;
       double ten=0;
       double yuShu=0;
       if(totalPrice>10){
           totalTen=(int)(totalPrice/10);
           for (int i = 0; i < totalTen; i++) {
              ten += 10*discount;
           }
            yuShu=totalPrice%10;
           totalPrice=yuShu+ten;

       }
       return totalPrice;}
}
