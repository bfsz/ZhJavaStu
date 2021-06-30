package java_se.stu12;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author BFSZ
 * @version 1.0
 * @description: 打印流
 * @date 2021/6/30 14:40
 */
public class StuPrintFlow {
    public static void main(String[] args) throws IOException{
        PrintStream printStream = new PrintStream("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu12\\file.txt");
        System.setOut(printStream);
        System.out.println(1234654);
    }
}
