package a_netCode.TCP.TCPPractice.ThreadUpload;

import java.io.IOException;
import java.net.Socket;

public class CloseUtils {
    private CloseUtils(){}
    public static void closeQ(Socket accept){
        if(accept!=null){
            try {
                accept.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
