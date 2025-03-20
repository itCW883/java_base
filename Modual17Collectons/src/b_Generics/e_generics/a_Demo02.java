package b_Generics.e_generics;

import java.util.ArrayList;
import java.util.Collection;

public class a_Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();
        /*
        四个类的子父类继承关系
        * Intege-->Number-->Object
          String-->Object
        * */

        get1(list1);
        //get1(list2);//list2的数据类型是(String)不是number类型和其子类类型
        get1(list3);
        //get1(list4);//list4的数据类型是(Object)不是number类型和其子类类型

        System.out.println("============================");

        //get2(list1);//list1的数据类型是(Integer)不是number类型和其父类类型
        //get2(list2);//list2的数据类型是(String)不是number类型和其父类类型
        get2(list3);
        get2(list4);
    }
    public static void get1(Collection<? extends Number> collection){
        //?接收的书局类型只能是number类和其子类的数据类型


    }

    public static void get2(Collection<? super Number> collection){
        //?接收的书局类型只能是number类和其父类的数据类型

    }
}
