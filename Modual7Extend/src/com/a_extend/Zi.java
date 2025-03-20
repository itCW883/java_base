package com.a_extend;
/*
* 1.子类重写父类方法权限必须大于等于父类权限(权限指访问修饰符权限)
*       public->protected->默认(不要写出来,写出会报错)->private
* 2.子类方法重写父类方法后,方法名要和参数列表一样
* 3.私有方法不能重写,构造方法不能重写,静态方法不能重写
* 4.子类重写父类方法后,返回值类型应该是父类返回值的类型(一般情况子类父类同类型[返回值,方法名,参数列表一般都是相同的])(关系到继承)
* */
public class Zi extends Fu{
    public void MethoudZi(){
        System.out.println("我是子类中的MethoudZi方法");
    }

    @Override
    public void Methoud(){
        System.out.println("我是子类中的Methoud方法");
    }
   // @Override报错了,因为子类权限小于父类权限了
//    private void Methoud1(){
//        System.out.println("我是子类中的Methoud方法");
//    }


    //@Override报错,因为静态方法不能重写
//   public static void Method02(){
//
//   }

@Override
//此处子类继承父类,所以Zi类型就是Fu父类型的子类类型
    public Zi Method03(){
return null;
    }

//@Override报错因为父类Method04方法的类型是Zi类型,
//                  而子类方法的类型是Fu类型,Fu类型不是Zi类型的子类类型
//    public Fu Method04(){
//        return null;
//    }
}
