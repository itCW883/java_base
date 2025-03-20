package h_set;

import java.util.HashSet;

public class testDemo03 {
    public static void main(String[] args) {
        HashSet<b_hash_employee> set = new HashSet<>();
        b_hash_employee taog = new b_hash_employee("taog", 20);
        b_hash_employee mag = new b_hash_employee("mag", 100);
        b_hash_employee tag = new b_hash_employee("taog", 20);
        b_hash_employee sph = new b_hash_employee("sph", 100);
        set.add(tag);
        set.add(mag);
        set.add(sph);
        set.add(taog);
        System.out.println("set = " + set);
        //set = [b_hash_employee{name='taog', age=20}, b_hash_employee{name='mag', age=100}, b_hash_employee{name='sph', age=100}]\
        //只有一个taog原因是b_hash_employee重写了equals方法和hsahcode方法
        //若不重重就会出现两个taog;因为不重写hshcode方法比较的是对象的hash值;这里比较的是个对象内容的hash值
    }
}
