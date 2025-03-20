package nextJDK8;

import java.util.Scanner;

public class e_test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var month =scanner.nextInt();
        SwitchOldRetirn(month);
        SwitchNewRetirn(month);
    }
/**
 *
 * */
    private static void SwitchNewRetirn(int month) {
       var season = switch (month) {
            case 12, 1, 2->
            {
                yield"冬季";
            }
            case 3, 4, 5->
            {
                yield"春季";
            }
            case 6, 7, 8->
            {
                yield"夏季";
            }
            case 9, 10, 11->
            {
                yield"球季";
            }
            default->
            {
                yield"输入错误,你过的是外星季节吧";
            }
        };
        System.out.println(season);
    }
/**
 * JDK13前想要拿到switch的返回结果;需要定义变量然后为其赋值
 * */
    private static void SwitchOldRetirn(int month) {
        String  season=null;
        switch (month){
            case 12,1,2:
                season="现在是冬天";
                break;
            case 3,4,5:
                season="现在是春天";
                break;
            case 6,7,8:
                season="现在是夏天";
                break;
            case 9,10,11:
                season="现在是秋天";
                break;
            default:
                season="输入错误,你过的是外星季节吧";
                break;
        }
        System.out.println(season);
    }



}
