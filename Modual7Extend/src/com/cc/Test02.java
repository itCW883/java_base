package com.cc;

public class Test02 {
    public static void main(String[] args) {
        Techer techer = new Techer();
        //继承的私有化属性不能直接使用,但是继承的get,set方法可以间接赋值私有化属性
        techer.setName("王城");
        techer.setAge(18);
        System.out.println(techer.getName() +"****"+ techer.getAge());

        //构造方法间接使用私有属性
        //通过子类的有参构造调用super调用父类的有参构造来进行赋值
        Manage manage = new Manage("李锐",18);
        System.out.println(manage.getName() + manage.getAge());

    }
}
