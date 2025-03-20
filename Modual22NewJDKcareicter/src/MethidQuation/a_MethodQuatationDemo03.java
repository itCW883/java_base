package MethidQuation;

import java.util.function.Supplier;
import java.util.stream.Stream;

//引用静态方法
public class a_MethodQuatationDemo03 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("马哥", "黑娃", "瘦皮猴", "或与好", "堂五零", "误导", "代码表");
        method(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        });
        System.out.println("===============方法引用=================");
        method(Math::random);
    }

    public static void method(Supplier<Double> supplier){
        Double aDouble = supplier.get();
        System.out.println("aDouble = " + aDouble);
    }
}
