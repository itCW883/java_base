package f_doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class puke {
    public static void main(String[] args) {
        //1.实例化一个用于存储花色的列表
        ArrayList<String> color = new ArrayList<>();
        color.add("黑桃");
        color.add("梅花");
        color.add("方片");
        color.add("红桃");

        //2.实例化一个用于存储牌号的列表
        ArrayList<String> numb = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            numb.add(i + "");
        }
        numb.add("J");
        numb.add("Q");
        numb.add("K");
        numb.add("A");
        //3.实例化一个集合用于存储花色和牌号
        ArrayList<String> poker = new ArrayList<>();
        for (String s : numb) {
            for (String col : color) {
                poker.add(s + col);
            }
        }
        poker.add("ColoefulJoker");
        poker.add("BlackJoker");
        //4. 打乱排序
        Collections.shuffle(poker);//shuffle属于Collections的静态方法
        //5.创建玩家和底牌
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        //6.开始发牌
        String fapai="";
        for (int i = 0; i < poker.size(); i++) {

            fapai= poker.get(i);//获取元素需要使用get方法;索引无法获取元素
            if (i < poker.size() - 3) {
                if (i % 3 == 0) {
                    play1.add(fapai);
                }
                else if (i % 3 == 1) {
                    play2.add(fapai);
                }
                else {
                    play3.add(fapai);
                }

            } else dipai.add(fapai);

        }
        Random random = new Random();
        int Dz = random.nextInt(poker.size());
        String DZP = poker.get(Dz);
        if(play1.contains(DZP)){//contain判断集合中是否包含某个元素
            play1.addAll(0,dipai);
        }
        if(play2.contains(DZP)){//contain判断集合中是否包含某个元素
            play1.addAll(0,dipai);
        }
        if(play3.contains(DZP)){//contain判断集合中是否包含某个元素
            play1.addAll(0,dipai);
        }

        Collections.sort(play1);
        Collections.sort(play2);
        Collections.sort(play3);


        System.out.println(play1);
        System.out.println(play2);
        System.out.println(play3);
        System.out.println(dipai);

    }

}
