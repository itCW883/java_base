package a_netCode.Practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class work1Clint {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 666);
        OutputStream outputStream = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入你要输入的信息");
            String bytes = scanner.nextLine();
            outputStream.write(bytes.getBytes());

            if("886".equals(bytes)){
                break;
            }
        }
        socket.close();
    }
}
