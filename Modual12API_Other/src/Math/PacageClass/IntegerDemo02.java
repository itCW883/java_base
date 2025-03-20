package Math.PacageClass;

public class IntegerDemo02 {
    public static void main(String[] args) {
        //Integer it1 = new Integer(10);//已过时 'Integer(int)' 自版本 9 起已弃用并标记为移除
        //System.out.println(it1);
//
        //Integer it2 = new Integer("123456789");//'Integer(java.lang.String)' 自版本 9 起已弃用并标记为移除
        //System.out.println(it2);
//
        //Boolean b001 = new Boolean(true);
        //Boolean b002 = new Boolean(false);
        //System.out.println(b001);
        //System.out.println(b002);
        //Boolean b003 = new Boolean("True");//true 因为底层比较实际使用的是equalsIgnoreCase()方法
        //System.out.println(b003);

        Integer itg1 = Integer.valueOf(10);
        System.out.println(itg1);

        Integer itg2 = Integer.valueOf("1213456789");
        System.out.println(itg2);

        int i1 = itg1.intValue();
        System.out.println(i1+10);
    }
}
