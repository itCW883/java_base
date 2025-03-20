package a_netCode.Practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class work1server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(666);
        Socket accept = serverSocket.accept();
        String data;
        byte[] bytes = new byte[1024];
        int len;
        InputStream ins = accept.getInputStream();
        while (true){

            len=ins.read(bytes);
            data = new String(bytes, 0, len);
            if("886".equals(data)){
                break;
            }

            System.out.println(data);
        }
        accept.close();
        serverSocket.close();
    }
}
