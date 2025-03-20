package com.cc;



public class Test01 {
    private static Dog dog;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Methoud(dog);


        Cat cat = new Cat();
        Methoud(cat);//ClassCastException类型转换异常Cat对象不能转换为Dog对象

    }
    public static void Methoud(Animal animal)//此处的参数也可以是接口类型(多态必须有子类父类继承关系,或者接口实现关系)
    {
        animal.Eat();
       if(animal instanceof Dog) {
            Dog dog=(Dog) animal;
            dog.Play();
        }

        /*
        * 这回将其他Animal的子类的对象都强转为Dog类型,此时等号左右两边类型就会不一致
        *       解决办法:向下转型前进行一次类型判断(instanceof)结果为boolean型
        *       格式: 对象名 instanceof 类的类型(判断关键字前的对象是否符合后面的类型)
        *             对象名 instanceof 接口的类型
        * */


    }

}
