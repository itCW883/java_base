package com.ruirui;
/*
* 抽象的注意事项:
*           1.抽象类不能直接实例化(new 对象),只能创建非抽象子类的对象
*           2.抽象类中不一定有抽象方法,抽象方法一定属于抽象类
*           3.抽象父类的子类必须重写父类的所有抽象方法,否则编译不通过(除子类也是抽象类)
*           4.抽象类中可以有:成员变量,构造方法,成员方法,抽象方法(与普通类相比只是多了一个可以抽象方法)
*                           抽象类的构造方法,是为子类创造对象时供子类初始化父类属性使用的
*           5.
*
* */
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        System.out.println("===========++++++=========");
        Dog dog = new Dog();
        dog.Drink();
    }

}
