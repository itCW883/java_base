package c_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class b_LinkedListDemo01 {
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

        //void addFirst(E e)
        //在该列表开头插入指定的元素。
        lkList.addFirst("曹操");
        System.out.println(lkList);

        //void addLast(E e)
        //将指定的元素追加到此列表的末尾。
        lkList.addLast("张郃");
        System.out.println(lkList);

        //E get(int index)
        //返回此列表中指定位置的元素。
        System.out.println(lkList.get(1));//刘备

        //E getFirst()
        //返回此列表中的第一个元素。
        System.out.println(lkList.getFirst());//曹操

        //E getLast()
        //返回此列表中的最后一个元素。
        System.out.println(lkList.getLast());//张郃

        //E remove()
        //检索并删除此列表的头（第一个元素）。
        System.out.println(lkList.remove());//曹操

        //E remove(int index)
        //删除该列表中指定位置的元素。
        System.out.println(lkList.remove(3));//赵云

        //boolean remove(Object o)
        //从列表中删除指定元素的第一个出现（如果存在）。
        System.out.println(lkList.remove("吕布"));//true

        //E removeFirst()
        //从此列表中删除并返回第一个元素。
        System.out.println(lkList.removeFirst());//刘备

        //boolean removeFirstOccurrence(Object o)
        //删除此列表中指定元素的第一个出现（从头到尾遍历列表时）。
        System.out.println(lkList.removeFirstOccurrence("赵云"));//true

        //E removeLast()
        //从此列表中删除并返回最后一个元素。
        System.out.println(lkList.removeLast());//张郃

        //boolean removeLastOccurrence(Object o)
        //删除此列表中指定元素的最后一次出现（从头到尾遍历列表时）。
        System.out.println(lkList.removeLastOccurrence("马超"));//true
        System.out.println(lkList);

        //LinkedLis的遍历

        Iterator<String> iterator = lkList.iterator();
        while (iterator.hasNext()){//判断下一个是否有值
            System.out.println(iterator.next());//获取下一个值
        }
        System.out.println("============================================");
        for (int i = 0; i < lkList.size(); i++) {
            System.out.println(lkList.get(i));//根据索引拿元素
            //底层是从链表里面拿数据
        }

        //E pop()
        //从此列表表示的堆栈中弹出一个元素。


        //void push(E e)
        //将元素推送到由此列表表示的堆栈上。

        //void add(int index, E element)
        //在此列表中的指定位置插入指定的元素。
        //boolean addAll(Collection<? extends E> c)
        //按照指定集合的迭代器返回的顺序将指定集合中的所有元素追加到此列表的末尾。
        //boolean addAll(int index, Collection<? extends E> c)
        //将指定集合中的所有元素插入到此列表中，从指定的位置开始。



        //void clear()
        //从列表中删除所有元素。
        //Object clone()
        //返回此 LinkedList的浅版本。
        //boolean contains(Object o)
        //如果此列表包含指定的元素，则返回 true 。


        //E element()
        //检索但不删除此列表的头（第一个元素）。

        //int indexOf(Object o)
        //返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
        //int lastIndexOf(Object o)
        //返回此列表中指定元素的最后一次出现的索引，如果此列表不包含元素，则返回-1。
        //ListIterator<E> listIterator(int index)
        //从列表中的指定位置开始，返回此列表中元素的列表迭代器（按适当的顺序）。
        //boolean offer(E e)
        //将指定的元素添加为此列表的尾部（最后一个元素）。
        //boolean offerFirst(E e)
        //在此列表的前面插入指定的元素。
        //boolean offerLast(E e)
        //在该列表的末尾插入指定的元素。
        //E peek()
        //检索但不删除此列表的头（第一个元素）。
        //E peekFirst()
        //检索但不删除此列表的第一个元素，如果此列表为空，则返回 null 。
        //E peekLast()
        //检索但不删除此列表的最后一个元素，如果此列表为空，则返回 null 。
        //E poll()
        //检索并删除此列表的头（第一个元素）。
        //E pollFirst()
        //检索并删除此列表的第一个元素，如果此列表为空，则返回 null 。
        //E pollLast()
        //检索并删除此列表的最后一个元素，如果此列表为空，则返回 null 。
        //E pop()
        //从此列表表示的堆栈中弹出一个元素。
        //void push(E e)
        //将元素推送到由此列表表示的堆栈上。

        //E set(int index, E element)
        //用指定的元素替换此列表中指定位置的元素。
        //int size()
        //返回此列表中的元素数。
        //Spliterator<E> spliterator()
        //在此列表中的元素上创建late-binding和故障快速 Spliterator 。
        //Object[] toArray()
        //以正确的顺序（从第一个到最后一个元素）返回一个包含此列表中所有元素的数组。
        //<T> T[] toArray(T[] a)
        //以正确的顺序返回一个包含此列表中所有元素的数组（从第一个到最后一个元素）; 返回的数组的运行时类型是指定数组的运行时类型。
    }
}
