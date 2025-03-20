package polymorphicCompareOriginal;

public class Dog extends Animal {
    @Override
    public void Eat() {
        System.out.println("狗啃骨头");
    }
    public void Play(){
        System.out.println("狗拿耗子,多管闲事");
    }
}
