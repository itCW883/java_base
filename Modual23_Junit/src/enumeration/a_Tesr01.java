package enumeration;

public class a_Tesr01 {
    public static void main(String[] args) {
        a_enum01 weifaho = a_enum01.WEIFAHO;
        System.out.println(weifaho);//会默认调用toString
        a_enum01 yifukuan = a_enum01.YIFUKUAN;
        String name = yifukuan.getName();
        System.out.println(name);
        System.out.println("===========枚举方法============");
        System.out.println("===========返回枚举值的名字============");
        String string = a_enum01.WEIFAHO.toString();
        System.out.println(string);
        System.out.println("===========获取所有枚举值============");
        a_enum01[] values = a_enum01.YIFUKUAN.values();//获取所有枚举值
        for (a_enum01 value : values) {
            System.out.println(value);
        }
        System.out.println("===========将字符串转为枚举值============");
        a_enum01 yiqianshou = a_enum01.valueOf("YIFAHUO");//传入的参数必须要是大写,且在枚举中存在
        System.out.println(yiqianshou.getName());


    }
}
