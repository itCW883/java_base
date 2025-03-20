package a_netCode.UDP.ZUBOUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ZuBosendDemo01 {
    public static void main(String[] args) throws IOException {
        //组播对象
        MulticastSocket multicastSocket = new MulticastSocket();
        String s1 = "我是一个组播程序";
        byte[] data =s1.getBytes();
        InetAddress addresses = InetAddress.getByName("224.0.0.1");
        int port=1010;

        DatagramPacket dp = new DatagramPacket(data, data.length, addresses, port);

        multicastSocket.send(dp);
        multicastSocket.close();

    }
}
