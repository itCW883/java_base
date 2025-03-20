package b_Generics.b_intendGenericsClass;

import java.util.Arrays;

public class a_demoo2Generics{
    public static void main(String[] args) {
        a_demoo1Generics<String> list = new a_demoo1Generics<>();
        list.add("马哥");
        list.add("瘦皮猴");
        System.out.println(list);

        a_demoo1Generics<Integer> list2 = new a_demoo1Generics<>();
        list2.add(12345);
        list2.add(456225);
        System.out.println(list2.get(0));
        System.out.println(list2);
    }

}
