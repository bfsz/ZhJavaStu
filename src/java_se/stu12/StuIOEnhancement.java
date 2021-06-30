package java_se.stu12;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bfsz
 * @version 1.0
 * @description: 缓冲流
 * 缓冲流
 * 也叫高效流，是对4个基本的`FileXxx` 流的增强，所以也是4个流，按照数据类型分类：
 * - 字节缓冲流：`BufferedInputStream`，`BufferedOutputStream`
 * - 字符缓冲流：`BufferedReader`，`BufferedWriter`
 * 缓冲流的基本原理，是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，从而提高读写的效率。
 * @date 2021/6/30 10:51
 */
public class StuIOEnhancement {
    public static void main(String[] args) throws IOException {
        bufferedRWTest();
    }

    /**
     * @description: 字节缓冲流
     * 构造方法
     * - `public BufferedInputStream(InputStream in)` ：创建一个 新的缓冲输入流。
     * - `public BufferedOutputStream(OutputStream out)`： 创建一个新的缓冲输出流
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 10:54
     */
    static void bufferedIODemo() throws IOException {
        // 开始时间
        long start = System.currentTimeMillis();
        // 读写数据
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\下载\\BitComet_1.77_setup.exe"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\下载\\BitComet_copy.exe"));
        ) {
            int len;
            byte[] bytes = new byte[8 * 1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流数组复制时间：" + (end - start) + " 毫秒");
    }

    /**
     * @description: 字符缓冲流
     * 构造方法
     * - `public BufferedReader(Reader in)` ：创建一个 新的缓冲输入流。
     * - `public BufferedWriter(Writer out)`： 创建一个新的缓冲输出流。
     * 特有方法
     * 字符缓冲流的基本方法与普通字符流调用方式一致，不再阐述，我们来看它们具备的特有方法。
     * - BufferedReader：`public String readLine()`: 读一行文字。
     * - BufferedWriter：`public void newLine()`: 写一行行分隔符,由系统属性定义符号。
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 11:06
     */
    static void bufferedRWDemo() throws IOException {
        // readLine 方法演示
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu12\\file.txt"));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.print(line);
            System.out.println("------------");
        }
        bufferedReader.close();

        // newLine 方法演示
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu12\\file.txt", true));
        bufferedWriter.write("hello world!");
        bufferedWriter.newLine();
        bufferedWriter.write("_bfsz");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    /**
     * @description: 练习
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 11:23
     */
    static void bufferedRWTest() throws IOException {
        // 创建map集合,保存文本数据,键为序号,值为文字
        HashMap<String, String> map = new HashMap<>();

        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu12\\a_in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu12\\a_out.txt"));

        // 读取数据，存入map
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] split = line.split("\\.");
            map.put(split[0], split[1]);
        }
        br.close();

        // 遍历 map，存入文本
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            bw.write(entry.getKey() + "." + entry.getValue());
            bw.newLine();
        }
        bw.close();
    }
}
