package polymorphicCompareOriginal;

public class Polymorphic {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Eat();//重写的
        dog.Play();//特有的
        Methoud1(dog);
        //Dog dog = new Cat();
        Cat cat = new Cat();
        Methoud1(cat);//不创建新方法会报错,因为类型不一致

        Animal dog2 = new Dog();
        Methoud3(dog2);
        Animal cat2 = new Cat();
        Methoud3(cat2);
    }
    //兼容性差
    public static void Methoud1(Dog dog){
        dog.Eat();
        dog.Play();

    }
    public static void Methoud1(Cat cat){

    }
    //多态兼容性好体现
    public static void Methoud3(Animal animal)//(Animal animal=dog2/cat2)Animal animal大类型可接收小类型
    //父类类型可以接收任意父类的子类对象,传递哪个子类对象,就指向那个子类对象,就调用那个子类对象重写的方法
        {
            animal.Eat();
    }
}
