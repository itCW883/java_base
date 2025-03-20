package a_map;

import java.util.*;

public class a_HashMapDemo02 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();//HashMap是键值对指定泛型实例化时需要指定泛型;泛型需要指定key和value的泛型
        //添加元素方法
        //V put(K key, V value) ;返回的时被覆盖的value
        //将指定的值与此映射中的指定键相关联。
        String value1 = map.put("马哥", "黑马");
        String value2 = map.put("马哥", "瘦皮猴");
        map.put("luox", "猴");
        map.put("xuqiang", "瘦猴");
        map.put("caigq", "皮猴");
        map.put("kailuo", "瘦皮猴");
        //可以存入null键null值
        map.put("null","null");
        System.out.println(map);


//一;HashMap的遍历
        //①:先将hashmap转为hashset
        Set<String> key1 = map.keySet();//获取所有的key保存到set集合中
        //②增强for遍历集合
        for (String s : key1) {
            //③根据key获取value
            System.out.println(map.get(s));
        }
        //第二小种遍历hashMap的方法;迭代器
        System.out.println("===================");
        Iterator<String> iterator = key1.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }
//二:遍历HashMap的方式:使用entrySet()方法同时获取key和value
        //1.使用map中的静态内部接口map.entryset先获取key和value的对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //2调用map.entryset中的两个方法;①getkey()②getvalue()
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key+value = " + key +"..."+ value);
        }
    }   
}
