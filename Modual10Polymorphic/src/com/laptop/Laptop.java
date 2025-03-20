package com.laptop;

import java.awt.*;

public class Laptop {

    public static void GuanJ(){
        System.out.println("笔记本关机");
    }
    public static void Run(){
        System.out.println("笔记本开机");
    }
    public static void UseUsb(Laptop laptop)
    //  public static void UseUsb(USB usb)可以是接口类型
    {
        if(laptop instanceof Mouse){
            Mouse mouse = (Mouse) laptop;
            mouse.Open();
            mouse.Clinck();
            mouse.DoubleClinck();
            mouse.Close();
        }
        else if (laptop instanceof KeyBoard){
            KeyBoard keyBoard=(KeyBoard) laptop;
            keyBoard.Open();
            keyBoard.Type();
            keyBoard.Close();
        }
    }
}
