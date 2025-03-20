package com.InternalClass.InnerClass04;

public class Test {
    public static void main(String[] args) {
        new USB(){

            @Override
            public void OPen() {
                System.out.println("鼠标连接主机");
            }

            @Override
            public void CLOSE() {

            }
        }.OPen();

        System.out.println("======================");

        USB keyBoard = new USB() {
            @Override
            public void OPen() {
                System.out.println("键盘连接主机");
            }

            @Override
            public void CLOSE() {

                System.out.println("键盘与主机的连接以断开");
            }
        };
        keyBoard.OPen();
        keyBoard.CLOSE();
    }
}
