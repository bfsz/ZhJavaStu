package java_se.stu10;

/**
 * -------------------------------------------------------------
 * 递归：指在当前方法内调用自己的这种现象。
 * 递归的分类:
 * - 递归分为两种，直接递归和间接递归。
 * - 直接递归称为方法自身调用自己。
 * - 间接递归可以A方法调用B方法，B方法调用C方法，C方法调用A方法。
 * 注意事项：
 * - 递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
 * - 在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
 * - 构造方法,禁止递归
 * -------------------------------------------------------------
 */

import java.io.File;

/**
 * @author bfsz
 * @version 1.0
 * @description: 递归
 * @date 2021/6/30 9:22
 */
public class StuRecursion {
    public static void main(String[] args) {
        int sum = getSum(6);
        System.out.println(sum);

        int jc = getTheFactorial(7);
        System.out.println(jc);

        File file = new File("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu10");
        printDir(file);
    }

    /**
     * @description: 递归累加求和
     * @param: sum
     * @return: int
     * @author bfsz
     * @date: 2021/6/30 9:25
     */
    static int getSum(int num) {
        return num == 1 ? 1 : num + getSum(num - 1);
    }

    /**
     * @description: 递归阶乘
     * @param: n
     * @return: int
     * @author bfsz
     * @date: 2021/6/30 9:32
     */
    static int getTheFactorial(int n) {
        return n == 1 ? 1 : n * getTheFactorial(n - 1);
    }

    /**
     * @description: 递归打印多级目录
     * @param: file
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 9:40
     */
    static void printDir(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println("文件名：" + f.getAbsolutePath());
            } else {
                System.out.println("目录：" + f.getAbsolutePath());
                printDir(f);
            }
        }
    }
}
