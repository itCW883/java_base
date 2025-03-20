package a_netCode.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class a_TCPClient {
    public static void main(String[] args) throws IOException {
//直接运行客户端,不运行服务端会出现异常ConnectException;因为TCP是面向连接的协议
        // 1:创建Socket的对象;指明服务端IP,和端口号
        Socket socket = new Socket("127.0.0.1", 9691);
        // 2:调用Socket对象中的getOutputStream[此处不直接new FileOutputStream对象;因为直接new是操作本地硬盘上的文件];获取输出流发送请求
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("我是TCP客户端;想观看马哥和瘦皮猴的爱恨情仇连续剧".getBytes());
        // 3:调用Socket对象中的getInputStream获取输入流;读取响应结果
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        // 4:关闭流对象
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
