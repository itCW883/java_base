package c_List;

import java.util.ArrayList;
import java.util.Iterator;

public class a_ArrayListDemo02 {
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

        //迭代器遍历
        //创建迭代器对象
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String nexted = iterator.next();
            System.out.println(nexted);
        }
        System.out.println("===========================");

        //for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
