package java_se.stu13;

import java.io.*;

/**
 * @author bfsz
 * @version 1.0
 * @description: 转换流
 * @date 2021/6/30 11:39
 */
public class StuConversionStreams {
    public static void main(String[] args) throws IOException {
        outputStreamWriterDemo();
    }

    /**
     * @description: InputStreamReader类
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 11:40
     */
    static void inputStreamReaderDemo() throws IOException {
        // 定义文件路径,文件为UTF8编码
        String FileName = "E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu13\\file.txt";
        // 创建流对象,默认UTF8编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(FileName));
        // 创建流对象,指定GBK编码
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream(FileName), "GBK");
        // 定义变量,保存字符
        int read;
        // 使用指定编码字符流读取,正常解析
        while ((read = isr.read()) != -1) {
            System.out.print((char) read); // 你好！
        }
        isr.close();

        // 使用GBK编码字符流读取,乱码
        while ((read = isr2.read()) != -1) {
            System.out.print((char) read);// 浣犲ソ锛�
        }
        isr2.close();
    }

    /**
     * @description: OutputStreamWriter类
     * 构造方法
     * - `OutputStreamWriter(OutputStream in)`: 创建一个使用默认字符集的字符流。
     * - `OutputStreamWriter(OutputStream in, String charsetName)`: 创建一个指定字符集的字符流。
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 11:52
     */
    static void outputStreamWriterDemo() throws IOException {
        // 定义文件路径
        String FileName = "E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu13\\out.txt";
        // 创建流对象,默认UTF8编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(FileName));
        // 写出数据
        osw.write("你好"); // 保存为6个字节
        osw.close();

        // 定义文件路径
        String FileName2 = "E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu13\\out2.txt";
        // 创建流对象,指定GBK编码
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream(FileName2), "GBK");
        // 写出数据
        osw2.write("你好");// 保存为4个字节
        osw2.close();
    }
}

