package com.love;

public class ErFenChaZhao {
    //二分查找法:
    //     1.数组中的数据必须是有序的
    //     2.每次找中间索引比较查询
    public static void main(String[] args) {
        int[] arry={1,2,3,4,5,6,7,8};
        int a=ChaZhao(arry,7);
        System.out.println(a);
    }
    public static int ChaZhao(int[] suJu,int a){
        int min=0;
        int max=suJu.length-1;
        int mid=0;
int tag=0;
       while (min<=max)
       {
           mid=(min+max)/2;
            if(suJu[mid]<a){
                min=mid+1;
            }
            else if(suJu[mid]>a){
                max=mid-1;
            }
            else {
                tag=tag+1;
                break;
            }
        }
        return tag;
    }
}
