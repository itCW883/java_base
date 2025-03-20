package com.InternalClass.innerClass2;

public class Person {
    public void eat(){
        class Heart{
            public void jump(){
                System.out.println("心脏框框跳");
            }
    }
    //调用局部内部类
        Heart heart = new Heart();
        heart.jump();
    //匿名对象调用局部内部类
        System.out.println("+++++++++++");
        new Heart().jump();
    }
}
/*局部内部类
     可以定义在方法中;构造中,代码块中
     局部内部类成员调用例:
            public class Person {
                public void eat(){
                    class Heart{
                        public void junp(){
                            System.out.println("心脏框框跳");
                        }
                }
                //实例化调用局部内部类
                    Heart heart = new Heart();
                    heart.junp();
                //匿名调用局部内部类
                    System.out.println("+++++++++++");
                    new Heart().junp();
                }
            }*/