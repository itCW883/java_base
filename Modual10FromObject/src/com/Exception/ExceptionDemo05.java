package com.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo05 {
    public static void main(String[] args) {
        String s=null;
        try {
            int a[]=null;
            System.out.println(a.length);
            add(s);
        } catch (IOException e) {
            System.out.println("文件未找到"+"   "+e);
        }
        catch (NullPointerException e){
            e.printStackTrace();//打印详细信息到控制台上
        }
        delete();
        update();
        find();
    }
    private static void add(String s) throws FileNotFoundException ,IOException{
        if(s==null){
            throw new IOException("IO异常");
        }
       if(!s.endsWith(".txt")){
           throw new FileNotFoundException("未找到该文件");
       }
        System.out.println("我要执行了");
    }
    private static void find() {
        System.out.println("查询功能");
    }

    private static void update() {
        System.out.println("修改功能");
    }

    private static void delete() {
        System.out.println("删除功能");
    }


}
