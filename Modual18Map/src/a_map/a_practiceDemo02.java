package a_map;

import java.util.*;

public class a_practiceDemo02 {
    public static void main(String[] args) {
        String[] huase ={"♥","♣","♠","♦"};
        String[] paihao = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<Integer> pukekey = new ArrayList<>();
        Integer key=0;
        for (String c1 : paihao) {
             for (String c : huase){
                map.put(key,c+c1);
                 pukekey.add(key);
                 key++;
            }

        }
        map.put(key,"🤡");
        pukekey.add(key);
        map.put(key+1,"black🤡");
        pukekey.add(key+1);
        Collections.shuffle(pukekey);
        ArrayList<Integer> I1 = new ArrayList<>();
        ArrayList<Integer> I2 = new ArrayList<>();
        ArrayList<Integer> I3 = new ArrayList<>();
        ArrayList<Integer> I4 = new ArrayList<>();
        for (int i = 0; i < pukekey.size(); i++) {
            Integer fapai = pukekey.get(i);
            if(i<=2){
                I4.add(fapai);
            }
            else {
                if(i%3==1){
                    I1.add(fapai);
                }
                else if(i%3==2){
                    I2.add(fapai);
                }
                else
               {
                    I3.add(fapai);
                }
            }
        }
    Collections.sort(I1);
    Collections.sort(I2);
    Collections.sort(I3);
    Collections.sort(I4);

        ArrayList maga = lookpai("马哥", I1, map);
        ArrayList sph = lookpai("瘦皮猴", I2, map);
        ArrayList hw = lookpai("黑娃", I3, map);
        ArrayList dp = lookpai("底牌", I4, map);
        System.out.println(maga);
        System.out.println(sph);
        System.out.println(hw);
        System.out.println(dp);
    }

    private static ArrayList lookpai(String name, ArrayList<Integer> list, HashMap<Integer, String> map) {
        ArrayList<String> backpai = new ArrayList<>();
        backpai.add(name);
        for (Integer i : list) {
           backpai.add(map.get(i));
        }
        return backpai;
    }


}
