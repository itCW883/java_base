package a_netCode.TCP.TCPPractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class a_UPloadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ssocket = new ServerSocket(9691);
        //解决文件名重复问题
        String download = UUID.randomUUID().toString()+System.currentTimeMillis();
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\短发睡姿\\图片\\"+download+".jpg");
        //"D:\\短发睡姿\\图片\\宝宝.txt"这里写死了了上传的文件的名字;所以会出现问题:无论上传多少次都只会有一个文件
        Socket accept = ssocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len ;
        while((len=inputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes);
        }
        System.out.println("============已经读取到数据;现在回响应==========");
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("上传成功".getBytes());


        fileOutputStream.close();
        accept.close();
        ssocket.close();


    }
}
