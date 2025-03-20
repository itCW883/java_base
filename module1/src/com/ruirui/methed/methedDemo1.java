package com.ruirui.methed;

public class methedDemo1 {
    public static void main(String[] args) {
        farmer();
        cook();
        coastomer();
    }


    /*viod代表无返回值,有void就不要return了
    * 方法不调用不执行
    * 方法间不能互相嵌套,是平级关系
    * 方法的执行顺序和定义顺序无关(只和调用顺序有关)*/
    public static void farmer(){
        System.out.println("播种");
        System.out.println("施肥");
        System.out.println("拔草");
        System.out.println("浇水");
        System.out.println("除虫");
        System.out.println("收割");
    }
    public static void cook(){
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
    }
    public static void coastomer(){
        System.out.println("洗手");
        System.out.println("吃饭");
    }
}
