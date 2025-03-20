package b_Stram;

import java.util.stream.Stream;

public class a_StreamPractice {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("马哥", "黑武士", "孙悟空", "抓八戒", "白龙马", "黛玉", "硝烟");
        Stream<String> stream2 = Stream.of("戴沐白", "或与好",  "堂三","堂梧桐", "堂五零", "蓝翾羽", "随便");
        Stream<String> p1 = stream1.filter(s -> s.length() == 3).limit(3);
        Stream<String> p2 = stream2.filter(s -> s.startsWith("堂")).skip(1);
        Stream.concat(p1,p2).forEach(s -> System.out.println(s));
    }
}
