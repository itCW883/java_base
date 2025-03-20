package a_netCode.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class a_TCPServert {
    public static void main(String[] args) throws IOException {
        //1:创建ServerSocket;设置端口号(无需知道客户端的ip)
        ServerSocket serverSocket = new ServerSocket(9691);
        //2:调用ServerSocket中的accept()方法[该方法是等待客户端连接的;返回的是连接服务端的Socket对象];监听客户端的连接
        Socket socket = serverSocket.accept();
        //3:调用Socket中的getInputStream读取请求
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        //4:调用Socket中的getOutputStream用于写响应
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("我是TCP服务端;开始播放马哥和瘦皮猴的爱恨情仇连续剧".getBytes());
        //5:关流(可以不关流;因为流是在连接通道里面的)
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
