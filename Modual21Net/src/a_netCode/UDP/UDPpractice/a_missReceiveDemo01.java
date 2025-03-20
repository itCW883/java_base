package a_netCode.UDP.UDPpractice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class a_missReceiveDemo01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(999);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        byte[] data = null;
        while(true){
            socket.receive(dp);
            int len=dp.getLength();
            data=dp.getData();
            String da = new String(data,0,len);
            System.out.println(da);
        }

    }
}
