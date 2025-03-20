package a_netCode.UDP.DanBoUDP;

import java.io.IOException;
import java.net.*;

public class a_sendDemo01 {
    public static void main(String[] args) throws IOException {
        //    1:创建 DatagramSocket(需要先指定发送端端口号)
        //        注意:①空参构造:端口号会从可用端口号中随机选取一个使用;
        //            ②有参构造:需要自己指定端口号
        DatagramSocket datagramSocket = new DatagramSocket();

        //    2:创建DatagramPacket对象;将数据进行打包

                //        注意:①打包要发送的数据-->将要发送的数据放入byte数组中
                byte[] bytes = "马哥和瘦皮猴的爱恨情仇".getBytes();
                //            ②指定接收端的IP
                InetAddress aimip =InetAddress.getByName("127.0.0.1");//本机IP是127.0.0.1
                //            ③:指定接收端的端口号;目的地端口号
                int port = 666;
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, aimip, port);
                //第二个参数是指定发送的数据的数组长度

        //    3:发送数据
        datagramSocket.send(datagramPacket);
        //    4:手动关闭Socket的对象释放资源
        datagramSocket.close();
        //因为是UDP协议编程即使没有接受端;执行发送端也不会报错;意外UDP面向无连接
    }
}
