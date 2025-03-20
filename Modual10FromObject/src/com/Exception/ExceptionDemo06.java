package com.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo06 {
    public static void main(String[] args)  {
        String s=null;
        try {
            add(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
           e.printStackTrace();
        }finally {
            System.out.println("灰太狼:我一定会回来的");
            System.out.println("再不出现特殊情况的时候;finally中的代码一定会执行");
        }
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
