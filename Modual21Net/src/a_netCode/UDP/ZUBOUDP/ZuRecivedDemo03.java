package a_netCode.UDP.ZUBOUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ZuRecivedDemo03 {
    public static void main(String[] args) throws IOException {
        //1:实例化组播对象
        MulticastSocket ms = new MulticastSocket(1010);
        //2:将本机添加到组播地址中
        InetAddress mydress = InetAddress.getByName("224.0.0.2");
        ms.joinGroup(mydress);
        System.out.println("在客户端发送数据前我会一直停在这里哦!!!");
        //3:接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ms.receive(dp);
        //4:解析数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        String result = new String(data,0,len);
        int port = dp.getPort();
        InetAddress address = dp.getAddress();
        System.out.println("地址为"+address+";端口号为"+port+"的主机;通过组播模式发送的数据是"+result);
        //5:关闭对象
        ms.close();

    }
}
