package a_netCode.TCP.TCPPractice.ThreadUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class a_UPloadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9691);
        FileInputStream fis = new FileInputStream("D:\\短发睡姿\\图片\\宝贝.jpg");
        byte[] bytes = new byte[1024];
        int len;
        OutputStream ops1 = socket.getOutputStream();
        while((len = fis.read(bytes))!=-1){
            ops1.write(bytes);
        }
       socket.shutdownOutput();//给对方一个结束标记;解决while判断到结束标记直接不执行循环体,不发送结束标记的问题
        System.out.println("以下是读取响应的结果++++++++++++++++");
        InputStream inputStream = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int lens = inputStream.read(bytes1);
        System.out.println(new String(bytes1,0,lens));

        fis.close();
        socket.close();

    }
}
