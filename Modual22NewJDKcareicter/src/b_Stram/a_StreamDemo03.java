package b_Stram;

import java.util.ArrayList;
import java.util.stream.Stream;

public class a_StreamDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("马哥");
        list.add("黑娃");
        list.add("瘦皮猴");
        list.add("蔡国庆");
        list.add("卢锡安");
        list.add("张无忌");
        list.add("张三丰");
//    集合:
//        default Stream<E> stream()
//        返回以此集合作为源的顺序 Stream
        Stream<String> stream = list.stream();
        System.out.println(stream);

        Stream<String> suzhu = Stream.of("马哥", "瘦皮猴", "黑黑", "蔡国庆");
        System.out.println(suzhu);

    }
}