package String.StringMethod;

public class TraverseString {
    public static void main(String[] args) {
        String s="abcdefg";
        for (int i = 0; i < s.length() ; i++) {
            System.out.printf(s.substring(i, i + 1));
            System.out.println(s.charAt(i));
        }
    }

}
