package String.StringMethod;

import java.util.Scanner;

public class PracticeCountDIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符:");
        String s = scanner.next();
        int maxcount,mincount,numcount,maxcount2,mincount2,numcount2;
        maxcount=0;
        mincount=0;
        numcount=0;
        maxcount2=0;
        mincount2=0;
        numcount2=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                mincount++;
            }
            else if (s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                maxcount++;
            }
            else if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                numcount++;
            }
        }
        System.out.println("大写字母有:" + maxcount + "个" + "小写字母有:" + mincount + "个" + "数字字符有:" + numcount + "个");
        System.out.println("===============");
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]>='a'&&charArray[i]<='z'){
                mincount2++;
            }
            else if (charArray[i]>='A'&&charArray[i]<='Z'){
                maxcount2++;
            }
            else if (charArray[i]>='0'&&charArray[i]<='9'){
                numcount2++;
            }
        }
        System.out.println("大写字母有:" + maxcount2 + "个" + "小写字母有:" + mincount2 + "个" + "数字字符有:" + numcount2 + "个");
    }
}
