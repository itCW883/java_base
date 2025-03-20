package b_Stram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a_StreamDemo04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("马哥");
        list.add("黑娃");
        list.add("瘦皮猴");
        list.add("蔡国庆");
        list.add("卢锡安");
        list.add("张无忌");
        list.add("张三丰");
        Stream<String> stream = list.stream();
        //foreach(stream);
        //count(stream);
       // filter(stream);
       // limit(stream);
        //skip(stream);
       // concat(stream);
        //collect(stream);
        //distinct(stream);
        //distinct2();//自定义类
        map(stream);
    }

    private static void map(Stream<String> stream) {
        /**
         * <R> Stream<R> map(Function<? super T,? extends R> mapper)
         * 参数为:Function转换型接口
         * 返回由给定函数应用于此流的元素的结果组成的流。
         * */
        stream.map(s -> s.getBytes()).forEach(chars -> System.out.println(chars));
    }

    private static void distinct2() {
        Stream<a_Person> stream = Stream.of(new a_Person("马哥", 18),
                                            new a_Person("马哥", 18),
                                            new a_Person("西门庆", 18),
                                            new a_Person("瘦皮猴", 19),
                                            new a_Person("嘿嘿", 22),
                                            new a_Person("蔡国庆", 38));
        stream.distinct().forEach(person-> System.out.println(person));
    }

    private static void distinct(Stream<String> stream) {
        /**
         * Stream<T> distinct()
         * 返回由该流的不同元素（根据 Object.equals(Object) ）组成的流。
         * 元素去重复;去重复是根据hash值进行的;hash值和内容一样才会去重复
         * 被去重的元素底层需要重写hashcode和equals方法
         * */
        List<String> collect = stream.collect(Collectors.toList());
        collect.add("马哥");
        collect.add("瘦皮猴大帅B");
        System.out.println(collect);
        Stream<String> stream1 = collect.stream();
        stream1.distinct().forEach(s -> System.out.println(s));
    }

    private static void collect(Stream<String> stream) {
        /**
         * <R,A> R collect(Collector<? super T,A,R> collector)
         * 使用 Collector对此流的元素执行 mutable reduction Collector 。
         * <R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
         * 对此流的元素执行 mutable reduction操作。
         * 将stream流转为集合*/
        List<String> collect = stream.collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void concat(Stream<String> stream) {
        /**
         * static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
         * 创建一个懒惰连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素。
         * 流合并,将两个Stream流合并为一个Stream流;返回的是一个stream对象
         *
         * */
        Stream<String> stream2 = Stream.of("悲惨世界", "马哥和瘦皮猴的爱恨情仇", "黑娃的和瘦皮猴的恩恩爱爱");
        foreach(Stream.concat(stream, stream2));
        


    }

    private static void skip(Stream<String> stream) {
        /**
         * Stream<T> skip(long n)
         * 在丢弃流的第一个 n元素后，返回由该流的 n元素组成的流。
         * 跳过前n个元素;返回一个Stream对象
         * */
        stream.skip(4).forEach(s -> System.out.println(s));
    }

    private static void limit(Stream<String> stream) {
        /**
         * Stream<T> limit(long maxSize)
         * 返回由此流的元素组成的流，截短长度不能超过 maxSize 。
         * 获取一个Stream流的前n个元素,返回一个stream流
         * */
        stream.limit(4).forEach(s-> System.out.println(s));
    }

    private static void filter(Stream<String> stream) {
        /**
         * Stream<T> filter(Predicate<? super T> predicate)
         * 参数类型是一个Predicate类型;是一个判断型函数接口
         * 返回由与此给定谓词匹配的此流的元素组成的流。
         * 返回一个新的Stream对象
         * */
        foreach(stream.filter(s -> s.length()==2));
    }

    private static void count(Stream<String> stream) {
        /**
         * count也是一个终结方法
         * long count()
         * 返回此流中的元素数。
         * */
        long count = stream.count();
        System.out.println(count);
    }

    private static void foreach(Stream<String> stream) {
        /**   集合:
         default Stream<E> stream()
         返回以此集合作为源的顺序 Stream

         foreach  逐一处理;方法遍历
         是一个终结方法;运行了这个方法后Stream流就被关闭了
         */
        stream.forEach(s -> System.out.println(s));
    }
}