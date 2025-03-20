package d_foreach;

import java.util.LinkedList;

public class a1_foreachDemo01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("zhangfei");
        list.add("刘备i");
        list.add("擦破超");
        list.add("关于");
        for (String each : list) {
            System.out.println(each);
            System.out.println("======================");
        }
int[] n={1,2,3,4,556,67,89,1,};
        for (int i : n) {
            System.out.println(i);
        }
        //1:增强for遍历集合时,底层原理为迭代器(遍历集合时不能谁便修改集合长度;否则会出现并发修改异常)
        //2:增强for遍历数组时;底层实现原理为普通for
    }
}
