package com.laptop;

public class KeyBoard extends Laptop implements USB{
    @Override
    public void Open() {
        System.out.println("键盘连接成功");
    }

    @Override
    public void Close() {
        System.out.println("键盘连接已关闭");
    }
    public static void Type(){
        System.out.println("正在打字中");
    }
}
