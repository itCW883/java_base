package a_map;

import java.util.HashMap;
import java.util.Scanner;

public class a_practiceDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> count = new HashMap<>();
        String s = scanner.next();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(count.containsKey(ch[i])==false){
                count.put(ch[i],1);
            }
            else
                count.put(ch[i],count.get(ch[i])+1);
        }
        System.out.println(count);
    }
}
