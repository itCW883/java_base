package com.ruibaao;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.nameFu);
       //父类不能调用子类的特有成员 System.out.println( fu.nameZi);

        Zi zi = new Zi();
        //子类继承父类,可以使用父类中非私有成员
        System.out.println(zi.namezi);
        System.out.println(zi.nameFu);


//     不重名情况下:   继承看等号左边是谁,先调用谁的成员;等号左边是子类类型,既能调用子类的对象,也能调用父类继承的非私有对象
//     重名情况下,子类调用的重名属性为子类自生属性
//      等号左边是谁,先调用谁的成员,子类没有找父类



        //多态情况也是一样的:   等号左边是谁,先调用谁的成员,子类没有找父类
        Fu fu1=new Zi();
        System.out.println(fu1.nameFu);//此时输出的是父类中的成员变量

    }
}
