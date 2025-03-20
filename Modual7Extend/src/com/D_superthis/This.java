package com.D_superthis;

/*
* this代表当前对象(谁调用的this就是代表的谁)
* 作用:  1.区分重名的成员变量和局部变量
*       2.调用当前对象的成员
* 使用:1.可以调用的当前对象的构造:
*                   在构造中写this()[调用无参构造],this(...实参...)调用当前对象的有参构造
*     2.调用当前对象的成员变量
*                   this.成员变量名
*     3.调用当前对象的成员方法:
*                   this.成员方法名(...实参...)
* */
public class This extends Super{
    int num=100;
    public This() {
        super();//调用父类[Super]中的无参构造
        System.out.println("我是子类中的无参构造");
    }

    public This(int data)
    {
        super(11);//调用父类[Super]的有参构造
        System.out.println("我是子类中的有参构造");

    }
    public void Methoud(){
        super.Methoud();//调用父类中的methoud方法
        System.out.println("我是子类中的methoud方法");
        System.out.println(num);//调用自生的成员变量
        System.out.println(super.num);//调用父类的成员变量

    }
}
