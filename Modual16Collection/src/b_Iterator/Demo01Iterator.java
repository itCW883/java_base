package b_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("哼哼哼");
        arr1.add("哈哈哈");
        arr1.add("嘿嘿嘿");
        arr1.add("嗨嗨嗨");
        arr1.add("呼呼呼");

        //获取迭代器对象
        Iterator<String> it1 = arr1.iterator();

        while (it1.hasNext())//循环判断是否还有下一个元素
        {
            String it2 = it1.next();//获取元素
            System.out.println(it2);

        }
    }
}
