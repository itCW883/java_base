package b_Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class a_Generics_Demo01 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("马哥");
        objects.add(1234567);
        objects.add(true);
        objects.add(1,5555);
//        for (Object object : objects) {
//            String s=(String) object;//.ClassCastException类型转换异常,因为没有指定泛型,存入的数据有其他非String类型的
//            System.out.println(s.length());
//        }

        //使用泛型后非泛型类型的数据更根本无法存入到集合中
        ArrayList<String> list = new ArrayList<>();
        list.add("瘦皮猴");
        //list.add(123456);//存入非泛型类型数据直接出现编译时异常
    }
}
