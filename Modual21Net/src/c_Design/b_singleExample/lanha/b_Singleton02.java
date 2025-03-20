package c_Design.b_singleExample.lanha;

//懒汉式
public class b_Singleton02 {
    //需要防止外界随意使用构造方法new对象,需要将构造私有化
    private b_Singleton02(){};
    //懒汉式;不着急new对象
    private static b_Singleton02 singleton02=null;
    //为了将内部new出来的对象给外界;可以定义一个方法;将内部的对象返回给外界
    public static b_Singleton02 getSingleton02(){
        //重点    //singleton02=new b_Singleton02();//不合理;因为外界调用一次就会new一个对象;就不是单例模式了
        //若b_Singleton02不是null就没有必要抢锁了
        if(singleton02==null){
            synchronized (b_Singleton02.class){//同步锁
                if(singleton02==null){//不能去掉去掉会重复new对象
                    singleton02=new b_Singleton02();//存在线程安全问题;需要加锁;(同步锁类名.class)
                }
            }
        }
        return singleton02;
    }
}
