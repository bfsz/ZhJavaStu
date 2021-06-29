package java_se.stu08;

/**
 * @author zhouhao
 * @version 1.0
 * @description: TODO
 * @date 2021/6/29 15:04
 */
public class StuThreadTest {
    public static void main(String[] args) {
        StuThread stuThread = new StuThread("新线程");
        stuThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main 线程！" + i);
        }
    }
}
