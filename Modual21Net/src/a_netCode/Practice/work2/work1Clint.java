package a_netCode.Practice.work2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class work1Clint {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 666);
        OutputStream outputStream = socket.getOutputStream();
        InputStreamReader iop = new InputStreamReader(socket.getInputStream());
        Scanner scanner = new Scanner(System.in);
        int data;
        while(true){
            System.out.println("请输入你要输入的信息");
            String bytes = scanner.nextLine();
            outputStream.write(bytes.getBytes());
           while((data=iop.read())!=-1){
               System.out.print((char)data);
           }
            if("886".equals(bytes)){
                break;
            }
        }

    }
}
