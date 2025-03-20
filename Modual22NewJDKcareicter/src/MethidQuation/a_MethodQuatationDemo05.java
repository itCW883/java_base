package MethidQuation;

import java.util.function.Function;

//数组--数组引用
public class a_MethodQuatationDemo05 {
    public static void main(String[] args) {
       method(new Function<Integer, int[]>() {
           @Override
           public int[] apply(Integer integer) {
               return new int[integer];
           }
       },10);
        System.out.println("================lambda表达式=================");
        method(integer -> new int[integer],10);
        System.out.println("================数组--数组引用=================");
        method(int[]::new,10);
    }

    public static void method(Function<Integer,int[]>function,Integer name){
        int[] apply = function.apply(name);
        System.out.println("apply.length = " + apply.length);
    }
}
