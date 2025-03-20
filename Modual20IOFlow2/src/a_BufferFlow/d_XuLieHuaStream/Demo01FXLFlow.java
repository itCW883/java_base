package a_BufferFlow.d_XuLieHuaStream;

import java.io.*;
import java.util.ArrayList;

public class Demo01FXLFlow {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       //writer();
        readr();
    }

    private static void readr() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream
                (new FileInputStream("Modual20IOFlow2\\src\\a_BufferFlow\\d_XuLieHuaStream\\person.txt"));
        //Object o = ois.readObject();//读取的数据可以强转为对应的类型
        //texPerson p = (texPerson) o;

        //一次反序列化多个序列化对象
        //EOFExceptio文件意外到达结尾异常:文件读取次数>文件存储个数时就会出现这个异常
        //解决办法很多:1:使用集合
                    //writer时就按ArrayList<>写入;直接序列化集合对象
                    //反序列化时按集合对读取;在遍历集合对象
        ArrayList<texPerson> tp = (ArrayList<texPerson>) ois.readObject();
        for (texPerson texPerson : tp) {
            System.out.println(texPerson);
        }



        //System.out.println(o.toString());

        ois.close();
    }

    //NotSerializableException被序列化的对象需要实现这个接口Serializable
    private static void writer() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream("Modual20IOFlow2\\src\\a_BufferFlow\\d_XuLieHuaStream\\person.txt"));
        ArrayList<texPerson> tp = new ArrayList<>();
        texPerson maga = new texPerson("马哥", 100);
        texPerson sph = new texPerson("瘦皮猴", 99);
        texPerson hei = new texPerson("黑娃", 88);

       tp.add(maga);
       tp.add(sph);
       tp.add(hei);
       //序列化集合对象
       oos.writeObject(tp);

        oos.close();

    }
}
