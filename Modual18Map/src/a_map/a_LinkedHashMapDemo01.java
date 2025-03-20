package a_map;

import java.util.LinkedHashMap;

public class a_LinkedHashMapDemo01 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        //key不可以重复value可重复
        lhm.put(11,"mag");
        lhm.put(12,"mag");
        lhm.put(13,"mag");
        lhm.put(14,"mag");
        lhm.put(15,"mag");
        lhm.put(16,"黑娃");
        lhm.put(11,"瘦皮猴");
        lhm.put(18,"马哥");
        System.out.println(lhm);
        //put返回的是被覆盖的值
        String lm = lhm.put(14, "一二三");
        System.out.println(lm);


    }
}
