package b_Generics.e_generics;

import java.util.ArrayList;

public class a_Demo01 {
    public static <meth> void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("mag");
        list.add("sph");
        list.add("heiwa");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1234);
        list2.add(234546);
        methoud(list);
        methoud(list2);
    }

    private static void methoud(ArrayList<?> list) {
        //?就代表泛型通配符
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
