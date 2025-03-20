package com.laptop;

public class Mouse extends Laptop implements USB
//不一定需要继承laptop类,直接实现接口也可以
{

    @Override
    public void Open() {
        System.out.println("鼠标连接成功");
    }

    @Override
    public void Close() {
        System.out.println("鼠标连接已关闭");
    }
    public static void Clinck(){
        System.out.println("点击鼠标中");
    }
    public static void DoubleClinck(){
        System.out.println("双击鼠标中");
    }
}
