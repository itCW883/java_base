package a_File;

import java.io.File;

public class a_FileDemo01 {
    public static void main(String[] args) {
        //public static final String pathSeparator
        //一个路径与其他路径间的分隔符
        // 与系统相关的路径分隔符字符，为方便起见，表示为字符串。 此字符串包含单个字符，即pathSeparatorChar 。

        String pathSeparator = File.pathSeparator;
        //    public static final String separator
        //路径里文件或文件夹间的分隔符
        //    与系统相关的默认名称分隔符 - 分隔符字符，以方便的方式表示为字符串。 该字符串包含一个字符，即separatorChar 。
        //不同操作系统间的路径分隔符号不相同;写路径时尽量不适应//
        //写路径时把//替换为Separator;这样会自动获取路径名称分隔符
        String separator = File.separator;
        String PATH = "E"+File.separator+"Idea"+File.separator+"Io";

        System.out.println(pathSeparator);
        System.out.println(separator);
    }
}
