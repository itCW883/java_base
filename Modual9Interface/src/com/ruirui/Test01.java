package com.ruirui;

public class Test01 {
    public static void main(String[] args) {
        USBComeTure USB = new USBComeTure();
        USB.open();
        USB.close();
        USB.MethodDef();
        IterfaceStatic.MethoudSta();//静态方法通过接口名.方法名调用,可以不需要实现类
        String num1 = IterfaceDemo03.NUM1;
        String num2 = IterfaceDemo03.NUM2;
        System.out.println(num1 + "...." + num2);
    }
}
