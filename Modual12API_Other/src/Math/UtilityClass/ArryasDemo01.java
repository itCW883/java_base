package Math.UtilityClass;

import java.util.Arrays;

public class ArryasDemo01 {
    public static void main(String[] args) {
       //1:static String toString(String[] a)
       //按照格式打印数组元素[元素1,元素2,...]
        int[] arr = {1,2,3,4,56,9,66,11};
        String ts = Arrays.toString(arr);
        System.out.println(ts);

        // 2:static Void Sort(int[] a)
        //   升序排列
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+" ");
        }
        System.out.println();
        System.out.println("=================");

        //3:static int binarySearch(int[] a,int key)
        //二分查找
        //有前提(二分查找必须是排好序的数组且是升序)
        int search = Arrays.binarySearch(arr, 11);
        System.out.println(search);//输出的是查找的次数

        //4:static int copyOf(int[] original,int newLength)
        //  数组扩容
        int[] arr2={1,2,3,4,5,6,7,8,90,1,2,34,5};
        int[] copy = Arrays.copyOf(arr2, 20);
        System.out.println(Arrays.toString(copy));
        arr2=copy;//地址值赋值给老数组(非常重要,否则就是实例化了一个新对象)
        System.out.println(Arrays.toString(arr2));

    }
}
