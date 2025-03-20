package com.InternalClass.InnerClass03;

public class Test01 {
    public static void main(String[] args) {
        USB usb = Method();//USB usb = new Mouse();
        usb.OPEN();
    }
    public static USB Method(){
        //局部内部类
        class Mouse implements USB{

            @Override
            public void OPEN() {
                System.out.println("鼠标打开USB连接电脑");
            }
        }
        return new Mouse();
    }

}
