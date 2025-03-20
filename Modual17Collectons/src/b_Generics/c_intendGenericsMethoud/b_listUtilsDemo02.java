package b_Generics.c_intendGenericsMethoud;

import java.util.ArrayList;

public class b_listUtilsDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        a_listUtilsDemo01.addAll(list,"张三","李四","瘦皮猴");
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        a_listUtilsDemo01.addAll(list2,1,2,3,4,5,6,7,89,9,213,455,19,667,7,1111);
        System.out.println(list2);

    }

}
