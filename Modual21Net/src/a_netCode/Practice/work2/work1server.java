package a_netCode.Practice.work2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class work1server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(666);
        Socket accept = serverSocket.accept();

        InputStreamReader ins = new InputStreamReader(accept.getInputStream());
       // OutputStreamWriter oup = new OutputStreamWriter(accept.getOutputStream());
        OutputStream oup = accept.getOutputStream();
        String send="成功接收到你的信息啦";
        int data;
        while ((data=ins.read())!=-1){
            System.out.print((char)data);
            oup.write(send.getBytes());
        }


        accept.close();
        serverSocket.close();
    }
}
