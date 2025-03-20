package com.Exception;

public class ExceptionDemo08 {
    public static void main(String[] args) {

    }
    class A {
        public void Method() throws Exception{
            System.out.println("父类方法throw,子类重写的方法可以throw也可以不throw");
        }
    }
    class B extends A{
        @Override
        public void Method() throws Exception{
            System.out.println("父类方法没有throw,子类重写的方法不可以throw异常");
        }
    }
}
