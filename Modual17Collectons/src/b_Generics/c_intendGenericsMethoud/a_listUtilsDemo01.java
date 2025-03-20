package b_Generics.c_intendGenericsMethoud;

import java.util.ArrayList;

public class a_listUtilsDemo01 {
    //定义一个静态方法addall
    public static <E> void addAll(ArrayList<E> list,E...e){
                                                            //E ...e代表可变参;可以传入多个参数
                                                            //<E>只代表声明了泛型并不代表反回值类型
                                                            //需要单独声明返回值类型

        //list.add(e);//不能直接传e因为定义函数时,接收的是可变参;可变参是一个数组;需要进行遍历;然后在添加元素
        for (E e1 : e) {
            list.add(e1);
        }

    }
}
