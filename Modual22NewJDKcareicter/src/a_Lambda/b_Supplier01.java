package a_Lambda;

import java.util.Arrays;
import java.util.function.Supplier;

public class b_Supplier01 {
    public static void main(String[] args) {
        method(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int[] arr={3,4,5,6,7,8};
                Arrays.sort(arr);
                return arr[arr.length-1];
            }
        });
        System.out.println("=============");
        method(()-> {
                int[] arr={3,4,5,6,7,8};
                Arrays.sort(arr);
                return arr[arr.length-1];
        });
    }
    public static void method(Supplier<Integer> supplier){
        Integer max = supplier.get();//让get方法返回一个数组最大值
        System.out.println("max = " + max);
    }
}
