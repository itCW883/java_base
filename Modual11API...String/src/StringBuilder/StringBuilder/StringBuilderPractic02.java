package StringBuilder.StringBuilder;

public class StringBuilderPractic02 {
    public static void main(String[] args) {
        String[] strings = {"abc", "bcd", "aaa", "ccc", "erty"};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (i != 0 && i != strings.length - 1) {
                stringBuilder.append(strings[i] + ",");
            } else {
                if (i == strings.length - 1) {
                    stringBuilder.append(strings[i] + "]");
                } else
                    stringBuilder.append("[" + strings[i] + ",");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
