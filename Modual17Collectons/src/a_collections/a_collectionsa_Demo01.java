package a_collections;

import java.util.ArrayList;
import java.util.Collections;

public class a_collectionsa_Demo01 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        //static <T> boolean addAll(Collection<? super T> c, T... elements)
        //参数1为接口类型(传入时传实现类对象);参数2为可变参(批量添加元素)
        //将所有指定的元素添加到指定的集合。
        Collections.addAll(strings,"马哥","瘦皮猴","黑娃","蔡国庆","罗星");
        System.out.println(strings);

        //static void shuffle(List<?> list)
        //使用默认的随机源随机排列指定的列表。
        //将集合中元素顺序打乱
        Collections.shuffle(strings);
        System.out.println(strings);

        //static <T extends Comparable<? super T>>
        //void sort(List<T> list)
        //根据其元素的natural ordering对指定的列表进行排序。
        //按默认规则排序(Ascall码表)排序

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","q","e","w","0","2","5");
        System.out.println(list);
        Collections.sort(list);//按首字母ascall码排;如果第一个相同则按第二个;依次类推
        System.out.println(list);

        //static <T> void sort(List<T> list, Comparator<? super T> c)
        //根据指定的比较器引起的顺序对指定的列表进行排序。
        //按指定规则去排序
        //Comparator<? super T>比较器
            //方法返回值为int类型: int compare(T o1,To2)
                                //o1-o2--->升序
                                //o2-01--->降序

    }
}
