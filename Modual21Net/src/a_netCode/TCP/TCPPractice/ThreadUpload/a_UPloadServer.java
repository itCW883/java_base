package a_netCode.TCP.TCPPractice.ThreadUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class a_UPloadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ssocket = new ServerSocket(9691);
        //多线程循环接收客户端的连接请求
        while (true){
            //解决文件名重复问题
            String download = UUID.randomUUID().toString()+System.currentTimeMillis();

            //"D:\\短发睡姿\\图片\\宝宝.txt"这里写死了了上传的文件的名字;所以会出现问题:无论上传多少次都只会有一个文件
            Socket accept = ssocket.accept();
            new Thread(new Runnable() {

                InputStream inputStream= null;
                FileOutputStream fileOutputStream=null;
                OutputStream outputStream=null;
                @Override
                public void run() {
                    try {
                         fileOutputStream = new FileOutputStream("D:\\短发睡姿\\图片\\"+download+".jpg");
                        inputStream = accept.getInputStream();
                        byte[] bytes = new byte[1024];
                        int len ;
                        while((len=inputStream.read(bytes))!=-1){
                            fileOutputStream.write(bytes);
                        }
                        System.out.println("============已经读取到数据;现在回响应==========");
                        outputStream = accept.getOutputStream();
                        outputStream.write("上传成功".getBytes());
                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {

                        CloseUtils.closeQ(accept);
                    }
                }
            }).start();

        }



    }
}
