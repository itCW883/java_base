package Math.UtilityClass;

public class SystemDemo01 {
    public static void main(String[] args) {
        //currentTimeMillis();
        //Exit();
        arryCopy();
    }

    private static void arryCopy() {
        //arraycopy数组复制
        //static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
                                //Object src 原数组
                                // int srcPos 从原数组的那个索引开始复制
                                //Object dest 目标数组
                                // int destPos 从目标数组的哪个索引开始粘贴
                                //int length 复制多少个元素
        //将指定源数组中的数组从指定位置复制到目标数组的指定位置。
        int[] arr1={1,2,3,4,5,6,78,9,80};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,1,arr2,0,6);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }

    private static void Exit() {
        for (int i = 0; i < 100; i++) {
            if(i==5){
                //exit(0)终止当前正在运行的虚拟机;一般参数传0;
                System.exit(0);
            }
            System.out.println("hello" + i);
        }
    }

    private static void currentTimeMillis() {
        //返回以毫秒为单位的时间;可以用于测试代码的运行效率[运行前获取的-运行后获取的]
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
