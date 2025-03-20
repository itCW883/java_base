package a_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class a_collectionsDemo03 {
    public static void main(String[] args) {
        //通过compare接口实现
        //方法compareTo(T o)--->this-o升序
        //-->0-this降序
        ArrayList<Stusent> stusents = new ArrayList<>();
        stusents.add(new Stusent("mag",20,"三年级",100));
        stusents.add(new Stusent("蔡国庆",22,"三年级",88));
        stusents.add(new Stusent("瘦皮猴",66,"三年级",99));
        //此时直接使用sort方法就不会报错啦,因为在Stsent类中实现类comparable接口,已经指定了排序规则
        Collections.sort(stusents);
        System.out.println(stusents);
    }
}
