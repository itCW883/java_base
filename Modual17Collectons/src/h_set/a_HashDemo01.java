package h_set;

import java.util.HashSet;

public class a_HashDemo01 {
    public static void main(String[] args) {
        b_hash_employee p1 = new b_hash_employee();
        b_hash_employee p2 = new b_hash_employee();
        System.out.println(p1);//h_set.b_hash_employee@b4c966a
        System.out.println(p2);// h_set.b_hash_employee@2f4d3709
//重写hashcode可以计算对象内容的hash值961
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(Integer.toHexString(961));

        System.out.println(Integer.toHexString(189568618));//b4c966a
        System.out.println(Integer.toHexString(793589513));//2f4d3709


//未重写hashcode方法的情况下hashcode输出的是地址值
        HashSet<String> haxi = new HashSet<>();
        haxi.add("马哥");
        haxi.add("瘦皮猴");
        haxi.add("马哥");
        haxi.add("牛马");
        haxi.add("黑娃");
        haxi.add("瘦皮猴");
        System.out.println(haxi.hashCode());

        String s1="abc";
        String s2 = new String("abc");
        //String重写了hashcode方法;计算的是属性值的hash值
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354


        String s3="通话";
        String s4="重地";
        //内容不一样不一定hash值不一样
        System.out.println("s3.hashCode() = " + s3.hashCode());//1179395
        System.out.println("s4.hashCode() = " + s4.hashCode());//1179395
    }
}
