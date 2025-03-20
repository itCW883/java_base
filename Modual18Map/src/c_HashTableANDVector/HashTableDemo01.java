package c_HashTableANDVector;

import java.util.Hashtable;

public class HashTableDemo01 {
    public static void main(String[] args) {
        Hashtable<String, String> ht1 = new Hashtable<>();
        ht1.put("a_马哥","哼哼哼");
        ht1.put("b_瘦皮猴","哼哼哼");
        ht1.put("c_黑娃","啦啦啦");
        ht1.put("a_马哥","呜呜呜");
        ht1.put("d_mafg","哼哼哼");
        //ht1.put(null,null);//NullPointerException存null键null值会空指针异常
        System.out.println(ht1);
    }
}
