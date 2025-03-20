package a_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
* 实际开发过程中在类上做注释用文档注释
* 因为
* */
public class a_LambdaDamo03 {
    public static void main(String[] args) {
        ArrayList<b_Person> people1 = new ArrayList<>();
        people1.add(new b_Person("马哥",100));
        people1.add(new b_Person("黑娃",99));
        people1.add(new b_Person("瘦皮猴",88));
        people1.add(new b_Person("蔡国庆",77));
        Collections.sort(people1, new Comparator<b_Person>() {
            @Override
            public int compare(b_Person o1, b_Person o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        System.out.println("=============Lambda=================");
        Collections.sort(people1,(b_Person o1, b_Person o2)-> {
                return o2.getAge()-o1.getAge();
        });
        System.out.println("=============Lambda表达式简化形式=================");
        Collections.sort(people1,(b_Person o1, b_Person o2)-> o2.getAge()-o1.getAge());
        System.out.println(people1.reversed());
    }
}
