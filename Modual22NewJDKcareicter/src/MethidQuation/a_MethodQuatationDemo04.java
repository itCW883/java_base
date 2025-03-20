package MethidQuation;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

//类--构造引用
public class a_MethodQuatationDemo04 {
    public static void main(String[] args) {
       method(new Function<String, b_Person>() {
           @Override
           public b_Person apply(String s) {
               return new b_Person(s);
           }
       },"马哥");
        System.out.println("============Lambda表达式=============");
       method(s -> new b_Person(s),"黑娃");
        System.out.println("==============方法引用============");
        method(b_Person::new,"瘦皮猴");
    }

    public static void method(Function<String,b_Person>function,String name){
        b_Person apply = function.apply(name);
        System.out.println(apply);

    }
}
