package java_se.stu10;

import java.io.File;
import java.io.IOException;

/**
 * @author bfsz
 * @version 1.0
 * @description: `java.io.File` 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。
 * - 构造方法：
 * `public File(String pathname)` ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
 * `public File(String parent, String child)` ：从父路径名字符串和子路径名字符串创建新的 File实例。
 * `public File(File parent, String child)` ：从父抽象路径名和子路径名字符串创建新的 File实例。
 * @date 2021/6/30 8:47
 */
public class StuFile {
    public static void main(String[] args) throws IOException {
        fileDemo3();
    }

    /**
     * @description: 构造举例
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 8:52
     */
    static void fileDemo1() {
        // 文件路径名字
        File file = new File("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu10\\files\\file.txt");
        // 父路径、子路径
        File file1 = new File("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu10\\files", "file.txt");
        // 父级File对象、子路径字符串
        File parentDir = new File("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu10\\files");
        File file2 = new File(parentDir, "file.txt");
    }

    /**
     * @description: 常用方法
     * - 获取功能
     * `public String getAbsolutePath()` ：返回此File的绝对路径名字符串。
     * `public String getPath()` ：将此File转换为路径名字符串。
     * `public String getName()`  ：返回由此File表示的文件或目录的名称。
     * `public long length()`  ：返回由此File表示的文件的长度。
     * - 判断功能
     * `public boolean exists()` ：此File表示的文件或目录是否实际存在。
     * `public boolean isDirectory()` ：此File表示的是否为目录。
     * `public boolean isFile()` ：此File表示的是否为文件。
     * - 创建删除功能
     * `public boolean createNewFile()` ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
     * `public boolean delete()` ：删除由此File表示的文件或目录。
     * `public boolean mkdir()` ：创建由此File表示的目录。
     * `public boolean mkdirs()` ：创建由此File表示的目录，包括任何必需但不存在的父目录。
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 8:58
     */
    static void fileDemo2() throws IOException {
        File file = new File("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu10\\files\\file.txt");
        // 获取功能
        System.out.println("返回此File的绝对路径名字符串：" + file.getAbsolutePath());
        System.out.println("将此File转换为路径名字符串：" + file.getPath());
        System.out.println("返回由此File表示的文件或目录的名称：" + file.getName());
        System.out.println("返回由此File表示的文件的长度：" + file.length());
        // 判断功能
        System.out.println("此File表示的文件或目录是否实际存在：" + file.exists());
        System.out.println("此File表示的是否为目录：" + file.isDirectory());
        System.out.println("此File表示的是否为文件：" + file.isFile());
        // 文件创建
        File file1 = new File("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu10\\files\\file01.txt");
        System.out.println("是否存在：" + file1.exists());
        System.out.println("是否创建：" + file1.createNewFile());
        System.out.println("是否存在：" + file1.exists());
        // 目录创建
        File file2 = new File("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu10\\files\\dirs");
        System.out.println("是否存在：" + file2.exists());
        System.out.println("是否创建：" + file2.mkdir());
        System.out.println("是否存在：" + file2.exists());
        // 多级目录创建
        File file4 = new File("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu10\\files\\dir_a\\dir_b");
        System.out.println(file4.mkdirs());
        // 文件的删除
        System.out.println(file1.delete());
        // 目录的删除
        System.out.println(file4.delete());
    }

    /**
     * @description: 目录遍历
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 9:17
     */
    static void fileDemo3() {
        File file = new File("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu10");

        //获取当前目录下的文件以及文件夹的名称
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }
        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
