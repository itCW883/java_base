package a_Lambda;

import java.util.function.Predicate;

public class b_Predicate01 {
    public static void main(String[] args) {
        method(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==7;
            }
        },"abc");
        System.out.println("==================");
        method(s -> s.length()==7,"qweqrty");
    }
        public static void method(Predicate<String> predicate ,String string){
            boolean test = predicate.test(string);
            System.out.println("test = " + test);
        }
}
