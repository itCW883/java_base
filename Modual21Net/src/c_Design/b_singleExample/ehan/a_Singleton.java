package c_Design.b_singleExample.ehan;
//饿汉式
public class a_Singleton {
    //需要防止外界随意使用构造方法new对象,需要将构造私有化
    private a_Singleton(){};
    //静态成员会最早产生(因此适合饿汉式),但是不能让外界随便调用因此还需要private关键字修饰
    //为了赶紧new对象,new对象时让对象变为静态的让对象随着类的加载而加载,
    //为了不让外界随便使用类名调用这个静态对象;因此使用private关键字进行修饰;将其变为私有的
    private static a_Singleton singleton=new a_Singleton();
    //为了将内部new出来的对象给外界;可以定义一个方法;将内部的对象返回给外界
    public static a_Singleton getSingleton(){
        return singleton;
    }
}
