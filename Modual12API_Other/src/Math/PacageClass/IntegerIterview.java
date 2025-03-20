package Math.PacageClass;

public class IntegerIterview {
    public static void main(String[] args) {
        Integer i1=100;
        Integer i2=100;
        System.out.println(i1 == i2);//true

        /*底层逻辑
        *  if (archivedCache == null || size > archivedCache.length) {
                Integer[] c = new Integer[size];
                int j = low;
                for(int i = 0; i < c.length; i++) {
                    c[i] = new Integer(j++);
                }
                archivedCache = c;
            }
            cache = archivedCache;*/
        //cache = archivedCache里面放的均是Integer对象

            /*
            * public static Integer valueOf(int i) {
            if (i >= IntegerCache.low && i <= IntegerCache.high)
                return IntegerCache.cache[i + (-IntegerCache.low)];
            return new Integer(i);
        }*/


        Integer i3=128;
        Integer i4=128;
        System.out.println(i3 == i4);//false
    }
}
