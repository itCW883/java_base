package MethidQuation;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class a_MethodQuatationDemo01 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("马哥", "黑娃", "瘦皮猴", "或与好", "堂五零", "误导", "代码表");
   /**     System.out.println("=============匿名内部类===============");
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
      /** System.out.println("============lambda表达式=============");
        stream.forEach(s -> System.out.println(s));*/
        System.out.println("==================方法引用====================");
        stream.forEach(System.out::println);

    }
}
