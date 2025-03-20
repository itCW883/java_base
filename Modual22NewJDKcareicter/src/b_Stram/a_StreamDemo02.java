package b_Stram;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class a_StreamDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("马哥");
        list.add("黑娃");
        list.add("瘦皮猴");
        list.add("蔡国庆");
        list.add("卢锡安");
        list.add("张无忌");
        list.add("张三丰");
    //Stream流
        //1:将对象转为Stream流对象
        Stream<String> stream = list.stream();
        stream.filter((s)->  s.startsWith("张")).filter((s) ->s.length()==3).forEach((s)-> System.out.println(s));
    }
}