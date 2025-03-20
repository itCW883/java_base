package a_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class a_collectionsDemo02 {
    public static void main(String[] args) {
        ArrayList<b_Person> bPeople = new ArrayList<>();
        b_Person person1 = new b_Person("马哥",20);
        b_Person person2 = new b_Person("瘦皮猴",21);
        b_Person person3 = new b_Person("黑娃",23);
        b_Person person4 = new b_Person("蔡国庆",29);
        b_Person person5 = new b_Person("罗星",22);
        Collections.addAll(bPeople,person1,person2,person3,person4,person5);
        System.out.println(bPeople);
        //static <T> void sort(List<T> list, Comparator<? super T> c)
        //根据指定的比较器引起的顺序对指定的列表进行排序。
        //按指定规则去排序
        //Comparator<? super T>比较器
        //方法返回值为int类型: int compare(T o1,To2)
        //o1-o2--->升序
        //o2-01--->降序
        Collections.sort(bPeople, new Comparator<b_Person>() {
            @Override
            public int compare(b_Person o1, b_Person o2) {
                return o1.getAge()- o2.getAge();
            }
        });
        System.out.println(bPeople);


        //通过compare接口实现
        //方法compareTo(T o)--->this-o升序
        //-->0-this降序
    }
}
