package c_HashTableANDVector;

import java.util.Vector;

public class a_VectorDemo01 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("马哥");
        vec.add("瘦皮猴");
        System.out.println(vec);
        for (String s : vec) {
            System.out.println(s);
        }
    }
}
