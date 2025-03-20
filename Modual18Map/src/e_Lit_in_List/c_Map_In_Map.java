package e_Lit_in_List;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class c_Map_In_Map {
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
        HashMap<String, HashMap> sth = new HashMap<>();
        sth.put("麻瓜",map1);
        sth.put("嗨嗨嗨",map2);
        Set<Map.Entry<String, HashMap>> entries = sth.entrySet();
        for (Map.Entry<String, HashMap> entry : entries) {
            String key = entry.getKey();
            System.out.println(entry);
            HashMap value = entry.getValue();
            Set set = value.entrySet();
            for (Object o : set) {
                System.out.println(o);
            }
        }

        Set<String> strings = sth.keySet();
        for (String s : strings) {
            System.out.println(sth.get(s));

        }
    }
}
