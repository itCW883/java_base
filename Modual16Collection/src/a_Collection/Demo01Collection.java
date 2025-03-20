package a_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll1 = new ArrayList<String>();
        //boolean add(E e) 往集合中存元素 add一定可以添加成功
        //确保此集合包含指定的元素（可选操作）。
        coll1.add("哈哈哈");
        coll1.add("啦啦啦");
        coll1.add("六六六");
        coll1.add("略略略");
        coll1.add("嘿嘿嘿");
        coll1.add("呜呜呜");
        coll1.add("嗡嗡嗡");
        coll1.add("哼哼哼");
        System.out.println(coll1);

        //boolean addAll(Collection<? extends E> c)
        // 传入的是一个Collection集合;将另一个集合的元素,添加到当前集合中[集合合并]
        //将指定集合中的所有元素添加到此集合（可选操作）。
        Collection<String> coll2 = new ArrayList<String>();
        coll2.add("901");
        coll2.add("890");
        coll2.add("789");
        coll2.add("678");
        coll2.add("567");
        coll2.add("456");
        coll2.add("234");
        coll2.add("123");
        coll1.addAll(coll2);
        System.out.println(coll1);

        //void clear()
        //从此集合中删除所有元素（可选操作）。
        coll1.clear();
        System.out.println("coll1 = " + coll1);

        //boolean contains(Object o)
        //如果此集合包含指定的元素，则返回 true 。
        Collection<String> coll3 = new ArrayList<>();
        coll3.add("890");
        coll3.add("789");
        coll3.add("678");
        coll3.add("567");
        coll3.add("456");
        coll3.add("234");
        coll3.add("123");
        System.out.println("coll3 = " + coll3);
        boolean contains = coll3.contains("123");
        System.out.println("contains = " + contains);


        //boolean isEmpty()
        //如果此集合不包含元素，如果为空则返回 true 。
        System.out.println("coll1.isEmpty() = " + coll1.isEmpty());


        //boolean remove(Object o)
        //从该集合中删除指定元素的单个实例（如果存在）（可选操作）。
        coll3.remove("456");
        System.out.println("coll3 = " + coll3);


        //int size()
        //返回此集合中的元素数。
        System.out.println("coll3.size() = " + coll3.size());

        //Object[] toArray()
        //将集合中元素转存到数组中
        //返回一个包含此集合中所有元素的数组。
        Object[] A1 = coll3.toArray();
        System.out.println("Arrays.toString(A1) = " + Arrays.toString(A1));
        for (int i = 0; i < A1.length; i++) {
            System.out.println("A1[i] = " + A1[i]);
        }

        //<T> T[] toArray(T[] a)
        //返回包含此集合中所有元素的数组; 返回的数组的运行时类型是指定数组的运行时类型。
    }
}
