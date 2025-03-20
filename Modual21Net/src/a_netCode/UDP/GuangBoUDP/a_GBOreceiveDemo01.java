package a_netCode.UDP.GuangBoUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class a_GBOreceiveDemo01 {
    public static void main(String[] args) throws IOException {
        // 1:创建 DatagramSocket;需要指定服务端的端口号
        DatagramSocket datagramSocket = new DatagramSocket(665);//端口号就是发送端的目的地端口号
        // 2:接收数据包
        byte[] bytes = new byte[1024];//数组容量习惯是1024的倍数;用于存放发送端发送的数据;这里的byte数组是小写的byte
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        System.out.println("我会在你接受到数据之前被发送出来");
        //该方法是阻塞的;程序执行到这该方法会在这死等;等到发送端成功发送数据过来;才会向下走
        datagramSocket.receive(datagramPacket);

        // 3:解析数据包
        byte[] data = datagramPacket.getData();//获取数据
        int len = datagramPacket.getLength();//从数据包中获取多少个数据
        InetAddress address = datagramPacket.getAddress();//获取发送端的主机IP地址
        int port = datagramSocket.getPort();//获取发送端端口号
        String s = new String(data,0, len);//表示把data数组从0索引开始一共len个字节转换为String
        System.out.println("发送过来的数据时 " + s);
        System.out.println("该数据的发送地址是"+address+"...发送的端口号是"+port);
        // 4:释放资源;关闭资源
        datagramSocket.close();

    }
}
