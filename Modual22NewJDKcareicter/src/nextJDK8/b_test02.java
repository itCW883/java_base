package nextJDK8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class b_test02 {
    public static void main(String[] args) {
        ArrayList<b_Person> list = new ArrayList<b_Person>();
        list.add(new b_Person("黑马",100));
        list.add(new b_Person("罗志祥",81));
        list.add(new b_Person("瘦皮黑",82));
        list.add(new b_Person("马哥",88));
        list.add(new b_Person("黑哇",83));
        list.add(new b_Person("黑哥们",98));
        Collections.sort(list, new Comparator<>() {
            @Override
            public int compare(b_Person o1, b_Person o2) {//JDK新特性:可以省略泛型类型
                return o2.getAge()-o1.getAge();
            }
        });
        Collections.sort(list, (o1,o2)->o2.getAge()-o1.getAge());
        System.out.println("list = " + list);
    }
}
