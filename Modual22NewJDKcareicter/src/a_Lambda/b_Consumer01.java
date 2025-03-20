package a_Lambda;

import java.util.function.Consumer;

public class b_Consumer01 {
    public static void main(String[] args) {
    method(new Consumer<String>() {
        @Override
        public void accept(String s) {
            System.out.println(s.length());
        }
    },"我的座位是在马哥的旁边");
        System.out.println("===============================");
        method(s-> System.out.println(s.length()),"我的座位是在马哥的旁边");
    }
    public static void method(Consumer<String> consumer,String s){
       consumer.accept(s);
    }
}
