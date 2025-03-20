package a_netCode.UDP.UDPpractice;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class a_missSendDemo01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要说的话");
        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] bytes=new byte[1024];
        InetAddress aimadd = InetAddress.getByName("127.0.0.1");
        int port = 999;
        String data=null;
        while ("886".equals(data)==false){
           data = scanner.next();
            byte[] by = data.getBytes();
            DatagramPacket dp = new DatagramPacket(by, by.length, aimadd, port);
            datagramSocket.send(dp);
        }
        datagramSocket.close();
    }
}
