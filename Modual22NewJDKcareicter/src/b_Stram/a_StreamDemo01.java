package b_Stram;

import java.util.ArrayList;

public class a_StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("马哥");
        list.add("黑娃");
        list.add("瘦皮猴");
        list.add("蔡国庆");
        list.add("卢锡安");
        list.add("张无忌");
        list.add("张三丰");
        //筛选出性张的人
        ArrayList<String> listzhang = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张"))
                listzhang.add(s);
        }
        System.out.println(listzhang);
        //筛选出性张的三个字的人
        ArrayList<String> listthree = new ArrayList<>();
        for (String s : listzhang) {
            if(s.length()==3)
                listthree.add(s);
        }
        System.out.println(listthree);
        //遍历集合打印姓张且为三个字的人
        for (String s : listthree) {
            System.out.println(s);
        }
    }
}