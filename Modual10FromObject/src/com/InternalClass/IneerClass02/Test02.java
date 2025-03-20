package com.InternalClass.IneerClass02;

public class Test02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Methoud(dog);
        System.out.println("=============");
        Animal dog2= Methou02d();
        dog2.eat();
    }
    public static void Methoud(Animal animal)
    {
       animal.eat();
           }
    public static Animal Methou02d(){
        /*Dog dog = new Dog();
        return dog;*/
        return new Dog();
    }
}
