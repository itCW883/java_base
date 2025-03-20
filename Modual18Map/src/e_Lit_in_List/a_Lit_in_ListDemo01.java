package e_Lit_in_List;

import java.util.ArrayList;

public class a_Lit_in_ListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("马哥");
        list1.add("瘦皮猴");
        list1.add("黑娃");
        list1.add("蔡国庆");
        list2.add("涛哥");
        list2.add("哼哼哼");
        list2.add("三上");
        list2.add("精炼");


        //将集合存入另一个集合中
        //因为存入的元素是list所有泛型的类型也要选择相应的list类型
        ArrayList<ArrayList> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        System.out.println(lists);

        //集合嵌套的遍历
        for (ArrayList list : lists) {
            for (Object o : list) {
                System.out.println(o);
            }
        }
    }
}
