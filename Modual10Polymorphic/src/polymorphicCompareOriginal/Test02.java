package polymorphicCompareOriginal;

public class Test02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Eat();
        //dog.play();不能调用子类特有功能
        Dog dog1=dog;
        dog1.Play();//向下转型后就可以掉特有功能
    }
}
