package com.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

import static java.nio.file.Files.delete;

public class ExceptionDemo04 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        String s=null;
        add(s);
        delete();
        update();
        find();
    }
    private static void add(String s) throws FileNotFoundException,IOException {
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
