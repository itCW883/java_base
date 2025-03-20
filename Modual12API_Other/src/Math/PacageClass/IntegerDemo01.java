package Math.PacageClass;

import java.util.ArrayList;

public class IntegerDemo01 {
    public static void main(String[] args) {
        ArrayList<Integer> it = new ArrayList<>();
        it.add(1);//此处需要传integer类型,这里传入的1被自动转换为了integer类型了,而非本身的int类型
    }
}
