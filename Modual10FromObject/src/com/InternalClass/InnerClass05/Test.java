package com.InternalClass.InnerClass05;

public class Test {
    public static void main(String[] args) {
        Method01(new USB() {
            @Override
            public void OPEN() {
                System.out.println("USB接口打开");
            }

            @Override
            public void CLOSE() {
                System.out.println("USB接口关闭");
            }
        });
        System.out.println("===================");

        USB usb=Method02();
        usb.CLOSE();
    }

    public static void Method01(USB usb){
        usb.OPEN();
    }

    public static USB Method02(){
        return new USB() {
            @Override
            public void OPEN() {
                System.out.println("USB接口打开");
            }

            @Override
            public void CLOSE() {
                System.out.println("USB接口关闭");
            }
        };
    }

}
