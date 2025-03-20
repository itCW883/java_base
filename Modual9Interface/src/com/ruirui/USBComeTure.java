package com.ruirui;

public class USBComeTure implements InterfaceDemo02,InterfaceDefault,IterfaceStatic//接口可以多实现,静态方法可以不需要实现类
 {
    @Override
    public void open() {
        System.out.println("usb接口打开");
    }

    @Override
    public void close() {
        System.out.println("USB接口关闭");
    }

     @Override
     public void MethodDef()//重写默认方法切记不要带default
        {
         System.out.println("我是USB3.0接口的默认方法");
     }
 }
