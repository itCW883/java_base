package c_List;

import java.util.Iterator;
import java.util.LinkedList;

public class b_LinkedListDemo02 {
    public static void main(String[] args) {
        LinkedList<String> lkList = new LinkedList<>();

        //boolean add(E e)
        //将指定的元素追加到此列表的末尾。
        lkList.add("刘备");
        lkList.add("关羽");
        lkList.add("张飞");
        lkList.add("赵云");
        lkList.add("马超");
        lkList.add("黄忠");
        lkList.add("赵云");
        lkList.add("马超");
        lkList.add("吕布");
        lkList.add("张辽");
        System.out.println(lkList);


        //E pop()
        //从此列表表示的堆栈中弹出一个元素。其实就是删除第一个元素
        lkList.pop();
        //底层源码
        // public E pop() {
        //        return removeFirst();
        //    }
        System.out.println(lkList);//弹栈
//对应栈的特点:后进先出
        //void push(E e)
        //将元素推送到由此列表表示的堆栈上。其实添加第一个元素
        lkList.push("哈哈哈哈");
        //底层源码
        //public void push(E e) {
        //      addFirst(e);
        //    }
        System.out.println(lkList);//压栈


    }
}
