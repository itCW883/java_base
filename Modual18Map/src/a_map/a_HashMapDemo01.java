package a_map;

import java.util.Collection;
import java.util.HashMap;

public class a_HashMapDemo01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();//HashMap是键值对指定泛型实例化时需要指定泛型;泛型需要指定key和value的泛型
        //添加元素方法
        //V put(K key, V value) ;返回的时被覆盖的value
        //将指定的值与此映射中的指定键相关联。
        String value1 = map.put("马哥", "黑马");
        System.out.println("value1 = " + value1);
        String value2 = map.put("马哥", "瘦皮猴");
        System.out.println(value2);
        System.out.println("map = " + map);
        map.put("luox", "猴");
        map.put("xuqiang", "瘦猴");
        map.put("caigq", "皮猴");
        map.put("kailuo", "瘦皮猴");
        System.out.println(map);
        System.out.println("==============================");

        //V remove(Object key)
        //从该地图中删除指定键的映射（如果存在）。
        //根据key删除键值对;返回的是被删除的value
        String mag = map.remove("caigq");
        System.out.println(mag);
        System.out.println(map);

        //boolean remove(Object key, Object value)
        //仅当指定的密钥当前映射到指定的值时删除该条目。
        //根据确定的键值对删除元素;返回值为boolean
        boolean rem = map.remove("kailuo", "瘦皮猴");
        System.out.println(rem);
        System.out.println("=======================");
        //V get(Object key)
        //返回到指定键所映射的值，或 null如果此映射包含该键的映射。
        //根据key获取value
        String tag = map.get("马哥");
        System.out.println(tag);
        System.out.println("===============");
        //boolean containsKey(Object key)
        //如果此映射包含指定键的映射，则返回 true 。
        //判断HashMap里是否包含指定的key;返回值是Boolean
        boolean key1 = map.containsKey("马哥");
        System.out.println(key1);
        System.out.println("===========================");

        //boolean containsValue(Object value)
        //如果此地图将一个或多个键映射到指定值，则返回 true 。
        //判断HashMap里是否包含指定的value;返回值是Boolean
        boolean value = map.containsValue("瘦皮猴");
        System.out.println(value);
        boolean val2 = map.containsValue("hh");
        System.out.println(val2);
        System.out.println("================");
        //Collection<V> values() 
        //返回此地图中包含的值的Collection视图。  
        //获取HashMap中的所有value存入Collection<V>中
        Collection<String> values = map.values();
        System.out.println(value);
        //可以存入null键null值
        map.put("null","null");
        System.out.println(map);



    }   
}
