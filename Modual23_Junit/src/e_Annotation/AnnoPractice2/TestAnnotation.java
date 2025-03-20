package e_Annotation.AnnoPractice2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 简单测试框架
* 当主方法执行后,会自动执行被检查的方法,判断方法是否有异常,记录到文件中
* */
public class TestAnnotation {

    public static void main(String[] args) throws IOException {
        //1:创建被测试对象
        Calculator calculator = new Calculator();
        //2:获取字节码文件对象
        Class aClass = calculator.getClass();
        //3:获取所有的方法
        Method[] methods = aClass.getMethods();
        int num=0;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bug.txt",true));

        for (Method method : methods) {
            //4:判断方法上是否有自定义的检测注解
          if(method.isAnnotationPresent(Check.class)){
              //5:有注解执行方法
              try {
                  method.invoke(calculator);
              } catch (Exception e) {
                  num++;
                  //6:捕获异常记录日志,记录到文件中
                  bufferedWriter.write(method.getName()+"方法出现异常啦");
                  bufferedWriter.newLine();
                  bufferedWriter.write("异常的名称:"+e.getCause().getClass().getSimpleName());
                  bufferedWriter.newLine();
                  bufferedWriter.write("异常的原因:"+e.getCause().getMessage());
                  bufferedWriter.newLine();
                  bufferedWriter.write("============================");
                  bufferedWriter.newLine();
              }
          }
        }
        bufferedWriter.write("本次测试一共出现"+num+"个异常");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
