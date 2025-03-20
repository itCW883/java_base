package c_List;

import java.util.ArrayList;
import java.util.Iterator;

public class a_ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //boolean add(E e)
        //将指定的元素追加到此列表的末尾。
        list.add(2);
        //list.remove(2);
        //若remove中直接传入整数,会默认为直接按索引位置删除元素
        //解决办法,将传入的整数包装为包装类,变为包装类后其父类就是Object
        // list.remove(new Integer(2));
        list.remove(Integer.valueOf(2));

        System.out.println(list);//IndexOutOfBoundsException索引越界异常
    }
}
