package e_Lit_in_List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class b_Map_In_List {
    public static void main(String[] args) {
        HashMap map1 = new HashMap<String,String>();
        HashMap map2 = new HashMap<String,String>();
        map1.put("马哥","涛哥");
        map1.put("瘦皮猴","哼哼");
        map1.put("黑娃","三上");
        map1.put("蔡国庆","精炼");
        map2.put("mag","马哥");
        map2.put("sph","瘦皮猴");
        map2.put("heiw","黑娃");
        map2.put("cgq","杀杀杀");
        ArrayList<HashMap> hm = new ArrayList<>();
        hm.add(map1);
        hm.add(map2);
        System.out.println(hm);
        for (HashMap hashMap : hm) {
            //获取所有的key,存入到集合中
            Set set = hashMap.entrySet();
            for (Object o : set) {
                System.out.println(o);
            }
            System.out.println("=========================");
            Set set1 = hashMap.keySet();
            for (Object o : set1) {
                System.out.println(hashMap.get(o));
            }
            System.out.println("=========================");
        }
    }
}
