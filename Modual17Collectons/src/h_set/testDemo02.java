package h_set;

import java.util.HashSet;

public class testDemo02 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("sbc");
        set.add("MAG");
        set.add("sbc");
        set.add("567");
        System.out.println("set = " + set);
    }
}
