package a_Lambda;

import java.util.function.Function;

public class b_Function01 {
    public static void main(String[] args) {
    method(new Function<Integer, String>() {
        @Override
        public String apply(Integer integer) {
            return integer+"";
        }
    },1234567890);
        System.out.println("=====================");
        method(integer->integer+"",1234567890);
    }
    public static void method(Function<Integer,String> function,Integer integer){
        String invers = function.apply(integer);
        System.out.println("invers = " + invers+1);
    }
}
