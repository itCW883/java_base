package com.ruirui;

public interface InterfaceDefault {
    /*格式:
    *      public default 返回值类型 方法名(){
    *         方法体
    *         return 返回值}
    *
    *
    * 使用:
    *  1:定义实现类实现接口
    *  2:默认方法可重写也可不重写
    *  3:通过:实现类对象.默认方法名调用
    * */
   public default void MethodDef(){
       System.out.println("我是USB接口的默认方法");
   }
}
