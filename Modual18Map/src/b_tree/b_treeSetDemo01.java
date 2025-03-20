package b_tree;

import java.util.Comparator;
import java.util.TreeSet;

public class b_treeSetDemo01
{
    public static void main(String[] args) {
        //            TreeSet()
        //            构造一个新的，空的树组，根据其元素的自然排序(ASCII)进行排序。
        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("c_白毛浮绿水");
        tree1.add("a_鹅鹅鹅");
        tree1.add("b_曲项向天歌");
        tree1.add("d_红掌拨清波");
        System.out.println(tree1);//[a_鹅鹅鹅, b_曲项向天歌, c_白毛浮绿水, d_红掌拨清波]
        //            TreeSet(Comparator<? super E> comparator)
        //            构造一个新的，空的树集，根据指定的比较器进行排序。

        System.out.println("=================================");
        TreeSet<Person> tree2 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        tree2.add(new Person("马哥",100));
        tree2.add(new Person("瘦皮猴",188));
        tree2.add(new Person("黑娃",99));
        System.out.println("tree2 = " + tree2);

    }
}
