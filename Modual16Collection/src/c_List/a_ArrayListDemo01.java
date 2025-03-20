package c_List;

import java.util.ArrayList;

public class a_ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //boolean add(E e)
        //将指定的元素追加到此列表的末尾。
        list.add("哈哈哈");
        list.add("略略略");
        list.add("123");
        list.add("432");
        list.add("345");
        list.add("789");
        System.out.println(list);

        //void add(int index, E element)
        //在此列表中的指定位置插入指定的元素。
        list.add(3,"我爱java");
        System.out.println(list);

        //E remove(int index)
        //删除该列表中指定位置的元素。
        System.out.println(list.remove(0));//返回的是被删除的元素
        System.out.println(list);

        //boolean remove(Object o)
        //从列表中删除指定元素的第一个出现（如果存在）。
        System.out.println(list.remove("123"));//返回的是true/false
        System.out.println(list);

        //E set(int index, E element)
        //用指定的元素替换此列表中指定位置的元素。
        System.out.println(list.set(0, "python有点搞忘记了"));//返回的是被替换的元素
        System.out.println(list);

        //E get(int index)
        //返回此列表中指定位置的元素。
        System.out.println(list.get(0));

        //int size()
        //返回此列表中的元素数。
        System.out.println(list.size());

    }
}
