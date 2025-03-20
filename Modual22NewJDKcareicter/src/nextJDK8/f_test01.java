package nextJDK8;

import java.util.Scanner;

public class f_test01 {
    public static void main(String[] args) {

       //不使用文本块的写法
      var s1 = "<body>\n" +
              "    <iframe src=\"./html/login.html\" id=\"iframepage\" scrolling=\"no\" onload=\"changeFrameHeight()\" frameborder=\"0\"\n" +
              "        style=\"width:100%\" marginwidth=\"0\" marginheight=\"0\"></iframe>\n" +
              "    <script src=\"js/jquery-2.1.1.min.js\" type=\"text/javascript\"></script>\n" +
              "    <script src=\"js/jquery-1.8.4.min.js\" type=\"text/javascript\"></script>\n" +
              "</body>";


        //使用文本块的写法
        //使用文本块是"""换行 """三引号对间必须换行
        //三引号中可以加("")双引号
        var s2= """
                <body>
                    <iframe src="./html/login.html" id="iframepage" scrolling="no" onload="changeFrameHeight()" frameborder="0"
                        style="width:100%" marginwidth="0" marginheight="0"></iframe>
                    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
                    <script src="js/jquery-1.8.4.min.js" type="text/javascript"></script>
                </body>
                """;

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
