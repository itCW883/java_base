package c_IOStreamPackage.FileUtils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class a_FileUtilsDemo01 {
    public static void main(String[] args) throws IOException {
        //    静态方法 :FileUtils.copyDirectoryToDirectory(File src,File dest);
        //            传递File类型的目录文件,进行整个目录的复制,自动进行遍历
        //            参数:
        //                src:药复制的文件夹路径
        //                dest:要将文件粘贴到哪里去
        //只能复制文件夹;不能将复制某一个文件过来;复制要以文件夹为单位
//        FileUtils.copyDirectoryToDirectory(new File("D:\\xue\\JAVA\\Project\\project1\\Modual19IOfLow"),
//                new File("D:\\xue\\JAVA\\Project\\project1\\Modual20IOFlow2\\src\\c_IOStreamPackage\\FileUtils"));



        //    静态方法: writeStringToFile(File file,String str)
        //            将字符串写到文本文件中
        FileUtils.writeStringToFile(new File("Modual20IOFlow2\\src\\c_IOStreamPackage\\FileUtils\\Modual19IOfLow\\1.txt"),
                "啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");



        //    静态方法: String readFileToString(File file)
        //            读取文本文件返回字符串
        String re = FileUtils.readFileToString(new File("Modual20IOFlow2\\src\\c_IOStreamPackage\\FileUtils\\Modual19IOfLow\\1.txt"));
        System.out.println("读取的文件为 : " + re);
    }
}
