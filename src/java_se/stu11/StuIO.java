package java_se.stu11;

/**
 * -----------------------------------------
 * ## IO的分类
 * 根据数据的流向分为：输入流和输出流。
 * - 输入流：把数据从`其他设备`上读取到`内存`中的流。
 * - 输出流：把数据从`内存` 中写出到`其他设备`上的流。
 * 格局数据的类型分为：字节流和字符流。
 * - 字节流：以字节为单位，读写数据的流。
 * - 字符流：以字符为单位，读写数据的流。
 * ------------------------------------------
 */

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author BFSZ
 * @version 1.0
 * @description: io 字节流、字符流
 * @date 2021/6/30 9:48
 */
public class StuIO {
    public static void main(String[] args) throws IOException {
        fileWriterDemo();
    }

    /**
     * @description: 字节输出流
     * OutputStream
     * * `public void close()` ：关闭此输出流并释放与此流相关联的任何系统资源。
     * * `public void flush() ` ：刷新此输出流并强制任何缓冲的输出字节被写出。
     * * `public void write(byte[] b)`：将 b.length字节从指定的字节数组写入此输出流。
     * * `public void write(byte[] b, int off, int len)` ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
     * * `public abstract void write(int b)` ：将指定的字节输出流。
     * FileOutputStream类
     * * `public FileOutputStream(File file)`：创建文件输出流以写入由指定的 File对象表示的文件。
     * * `public FileOutputStream(String name)`： 创建文件输出流以指定的名称写入文件。
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 10:01
     */
    static void outputStreamDemo() throws IOException {
        // 文件名创建流对象(数据追加续写:参数中都需要传入一个boolean类型的值，`true` 表示追加数据，`false` 表示清空原有数据)
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu11\\file.txt", true);
        // 写数据
        fileOutputStream.write(97);
        fileOutputStream.write(98);
        fileOutputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.write(99);
        // 关闭资源
        fileOutputStream.close();
    }

    /**
     * @description: 字节输入流
     * InputStream
     * - `public void close()` ：关闭此输入流并释放与此流相关联的任何系统资源。
     * - `public abstract int read()`： 从输入流读取数据的下一个字节。
     * - `public int read(byte[] b)`： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。
     * FileInputStream类
     * - `FileInputStream(File file)`： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
     * - `FileInputStream(String name)`： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 10:13
     */
    static void inputStreamDemo() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu11\\file.txt");
        int len;
        byte[] b = new byte[256];
        /*使用数组读取，每次读取多个字节，减少了系统间的IO操作次数，从而提高了读写的效率，建议开发中使用*/
        while ((len = fileInputStream.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
        fileInputStream.close();
    }

    /**
     * @description: 字节流图片复制
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 10:25
     */
    static void imageCopy() throws IOException {
        // 数据源
        FileInputStream fileInputStream = new FileInputStream("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu11\\image.png");
        // 目的地
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu11\\image_copy.png");
        // 读写
        byte[] b = new byte[1024];
        int len;
        while ((len = fileInputStream.read(b)) != -1) {
            fileOutputStream.write(b, 0, len);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }

    /**
     * @description: 字符输入流
     * Reader
     * - `public void close()` ：关闭此流并释放与此流相关联的任何系统资源。
     * - `public int read()`： 从输入流读取一个字符。
     * - `public int read(char[] cbuf)`： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。
     * FileReader类
     * - `FileReader(File file)`： 创建一个新的 FileReader ，给定要读取的File对象。
     * - `FileReader(String fileName)`： 创建一个新的 FileReader ，给定要读取的文件的名称。
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 10:29
     */
    static void fileReaderDemo() throws IOException {
        FileReader fileReader = new FileReader("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu11\\file.txt");
        int b;
        char[] cbuf = new char[1024];
        while ((b = fileReader.read(cbuf)) != -1) {
            System.out.print(new String(cbuf, 0, b));
        }
        fileReader.close();
    }

    /**
     * @description: 字符输出流
     * Writer
     * - `void write(int c)` 写入单个字符。
     * - `void write(char[] cbuf) `写入字符数组。
     * - `abstract  void write(char[] cbuf, int off, int len) `写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
     * - `void write(String str) `写入字符串。
     * - `void write(String str, int off, int len)` 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
     * - `void flush() `刷新该流的缓冲。
     * - `void close()` 关闭此流，但要先刷新它。
     * FileWriter类
     * - `FileWriter(File file)`： 创建一个新的 FileWriter，给定要读取的File对象。
     * - `FileWriter(String fileName)`： 创建一个新的 FileWriter，给定要读取的文件的名称。
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 10:36
     */
    static void fileWriterDemo() throws IOException {
        // 续写加 true
        FileWriter fileWriter = new FileWriter("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu11\\file.txt", true);
        // 字符
        fileWriter.write(30000);
        fileWriter.write(30001);
        // 写出字符数组
        char[] chars = "dafewrewq".toCharArray();
        fileWriter.write(chars);
        fileWriter.write(chars, 2, 2);
        // 写出字符串
        String name = "dadadadad";
        fileWriter.write(name);
        fileWriter.write(name, 2, 2);
        fileWriter.flush();
        fileWriter.close();
    }

}
