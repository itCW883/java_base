package com.xue.Class;

public class Phone {

    String pingPai;
    double dianChiCapacity;
    String color;
    String xinHao;

    public void TellPhone(){
        System.out.println("手机的基本功能是打电话");
    }
    public void SendMessage(){
        System.out.println("发短信也是手机的基本功能");
    }
    public void Phone(){
        System.out.println("不要沉迷于手机哦");
    }
    public String PlayGame(){
        String back="现在老年机也可以打游戏啦";
        return back;
    }
    public void DaDianH(String name){
        System.out.println("给"+name+"打电话");
    }
}
