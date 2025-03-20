package practice;

public class Test01 {
    public static void main(String[] args) {
        //通过构造函数初始化对象实现:
        Android android = new Android("123","王城");
        //通过有参构造初始化了对象
        android.work();
        HardWareEnerge hardWareEnerge = new HardWareEnerge("4567","哈哈哈");
        hardWareEnerge.work();
        //还可以通过set,get方法实现
        JaveEE javeEE = new JaveEE();
        javeEE.setName("李锐");
        javeEE.setEmNum("123456");
        javeEE.work01();
    }
}
