package a_BufferFlow.d_XuLieHuaStream;

import java.io.*;

public class Demo01XLFlow {
    public static void main(String[] args) throws IOException {

        writer();
    }
//NotSerializableException被序列化的对象需要实现这个接口Serializable
    private static void writer() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream("Modual20IOFlow2\\src\\a_BufferFlow\\d_XuLieHuaStream\\person.txt"));
        texPerson maga = new texPerson("马哥", 100);
        oos.writeObject(maga);

        oos.close();

    }
}
