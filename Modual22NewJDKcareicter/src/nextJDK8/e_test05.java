package nextJDK8;

import java.util.Scanner;

public class e_test05 {
    public static void main(String[] args) {
       method01();
       method02();
    }

    private static void method02() {
        Scanner scanner = new Scanner(System.in);
        var month =scanner.nextInt();
        /**
         * 解决case穿透性将:替换为->
         * */
        switch (month) {
            case 12, 1, 2->
                System.out.println("现在是冬天");
            case 3, 4, 5->
                System.out.println("现在是春天");
            case 6, 7, 8->
                System.out.println("现在是夏天");
            case 9, 10, 11->
                System.out.println("现在是秋天");
            default->
                System.out.println("输入错误,你过的是外星季节吧");
        }
    }

        private static void method01() {
            Scanner scanner = new Scanner(System.in);
            var month =scanner.nextInt();
            /**
             * 这种形式break不写;依然会出现case穿透性
             * */
            switch (month){
                case 12,1,2:
                    System.out.println("现在是冬天");
                    break;
                case 3,4,5:
                    System.out.println("现在是春天");
                    break;
                case 6,7,8:
                    System.out.println("现在是夏天");
                    break;
                case 9,10,11:
                    System.out.println("现在是秋天");
                    break;
                default:
                    System.out.println("输入错误,你过的是外星季节吧");
            }
    }
}
