package a_File;

import java.io.File;

public class a_FileDemo02 {
    public static void main(String[] args) {
       //public File(String parent,String child)
        //    //从父路径名字符串和子路径名字符串创建新的File实例。
        //      参数
        //      parent - 父路径名字符串
        //      child - 子路径名字符串
        //      异常
        //      NullPointerException - 如果 child是 null
        File file1 = new File("D:\\短发睡姿", "李锐个人简历(1).pdf");//子路径只要是一个路径就行;不一定需要是某一个具体的文件
        System.out.println(file1);


        //    //public File(File parent,String child)
        //      参数
        //      parent - 父抽象路径名
        //      child - 子路径名字符串
        //      异常
        //      NullPointerException - 如果 child是 null
        File parent = new File("D:\\短发睡姿");
        File file2 = new File(parent, "李锐个人简历(1).pdf");
        System.out.println(file2);


        //    //public File(String pathname)
        //          参数
        //          pathname - 路径名字符串
        //          异常
        //          NullPointerException - 如果 pathname参数是 null
        File file3 = new File("D:\\短发睡姿\\李锐个人简历(1).pdf");
        System.out.println(file3);

        //创建File对象时;传入的路径是可以在本地不存在的路径;但是传递不存在的路径无意义
    }
}
