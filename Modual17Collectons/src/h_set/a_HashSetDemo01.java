package h_set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class a_HashSetDemo01 {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<>();
        set.add("马哥");
        set.add("瘦皮猴");
        set.add("黑娃");
        set.add("马哥");
        set.add("开罗");
        set.add("李燕");
        Collections.addAll(set,"heima","sph","xiaobud");

        System.out.println(set);//[黑娃, 瘦皮猴, 马哥, 开罗, 李燕]存取顺序不一致;每次取数据还是一样的
                                // 且会自动去重;会删除重复的数据,只保留一个

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.printf(iterator.next()+" ## ");
        }
        System.out.println();
        System.out.println("==================");
        for (String s : set) {
            System.out.printf(s+" $$ ");
        }

    }
}
