package a_netCode.TCP.TCPPractice;

import java.util.UUID;

public class b_Demo01UUID {
    public static void main(String[] args) {
        //和从网上下载资源一样,会随机命名
        String string = UUID.randomUUID().toString();
        System.out.println("string = " + string);
    }
}
