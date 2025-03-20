package MethidQuation;

import java.util.function.Supplier;
import java.util.stream.Stream;
//引用成员方法
public class a_MethodQuatationDemo02 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("马哥", "黑娃", "瘦皮猴", "或与好", "堂五零", "误导", "代码表");
         method(new Supplier<String>() {
             @Override
             public String get() {
                 return " abc ".trim();
             }
         });
        System.out.println("============lambad表达式===============");
        method(()->" abc ".trim());
        System.out.println("============方法引用===============");
        method(" sbc "::trim);
    }

    public static void method(Supplier<String> supplier){
        String s = supplier.get();
        System.out.println(s+"");
    }
}
