package a_map.a_test;

import java.util.HashMap;

public class Demo01HashMap {
    public static void main(String[] args) {
        //map的key去重只需要在类中重写equals方法和hashset方法即可
        HashMap pepo = new HashMap<Person,String>();
        pepo.put(new Person("马哥",100),"重庆市");
        pepo.put(new Person("黑娃",120),"日本省");
        pepo.put(new Person("瘦皮猴",110),"重庆市");
        pepo.put(new Person("凯哥",990),"青海省");
        pepo.put(new Person("马哥",100),"四川市");
        System.out.println("pepo = " + pepo);
    }
}
