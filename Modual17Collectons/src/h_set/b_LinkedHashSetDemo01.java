package h_set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class b_LinkedHashSetDemo01 {
    public static void main(String[] args) {


        LinkedHashSet<String> lkhs = new LinkedHashSet<>();
        lkhs.addFirst("马哥");
        lkhs.add("瘦皮猴");
        lkhs.add("尼格");
        lkhs.add("马哥");
        lkhs.add("呵护");
        lkhs.add("牛马");
        lkhs.add("瘦皮猴");
        lkhs.addLast("牛马");
        System.out.println(lkhs);//相同数据只会保留第一个数据

        //遍历LinkedHashSet
        for (String lkh : lkhs) {
            System.out.printf(lkh+" $ ");
        }
        System.out.println();
        Iterator<String> iterator = lkhs.iterator();
        while (iterator.hasNext()){
            System.out.printf(iterator.next()+" @ ");

        }


    }
}
