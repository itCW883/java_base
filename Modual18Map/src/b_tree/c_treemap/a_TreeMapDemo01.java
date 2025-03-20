package b_tree.c_treemap;

import b_tree.Person;

import java.util.Comparator;
import java.util.TreeMap;

public class a_TreeMapDemo01 {
    public static void main(String[] args) {
        //TreeMap()
        //使用其键的自然排序构造一个新的空树状图。
        TreeMap<String, String> tp1 = new TreeMap<>();
        tp1.put("a","马哥");
        tp1.put("d","瘦皮猴");
        tp1.put("a","老马");
        tp1.put("b","黑娃");
        tp1.put("f","哈哈哈");
        System.out.println(tp1);
        //TreeMap(Comparator<? super K> comparator)
        //构造一个新的，空的树图，按照给定的比较器排序。
        TreeMap<Person, String> tp2 = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        tp2.put(new Person("马哥",99),"哈哈哈");
        tp2.put(new Person("瘦皮猴",919),"嘻嘻嘻");
        tp2.put(new Person("黑娃",199),"嗨嗨嗨");
        tp2.put(new Person("螺旋",9),"呵呵呵");
        tp2.put(new Person("瘦皮猴",19),"啦啦啦");
        tp2.put(new Person("黑娃",199),"哼哼哼");
        System.out.println(tp2);
    }
}
