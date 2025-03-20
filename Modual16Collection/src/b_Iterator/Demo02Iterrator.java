package b_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo02Iterrator {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("唐僧");
        strings.add("孙悟空");
        strings.add("猪八戒");
        strings.add("沙僧");

        //Iterator<String> iterator = strings.iterator();
        ListIterator<String> iterator = strings.listIterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if ("猪八戒".equals(next))//"猪八戒".equals(next)可以防止空指针问题
            {
                //strings.add("白龙马");//ConcurrentModificationException
               iterator.add("白龙马");//解决并非修改问题,使用AbstractList类中的方法add
            }
        }
        System.out.println(strings);
    }
}
