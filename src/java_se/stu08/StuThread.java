package java_se.stu08;

/**
 * @author BFSZ
 * @version 1.0
 * @description: 多线程
 * @date 2021/6/29 15:00
 */
public class StuThread extends Thread {
    public StuThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "：正在执行！" + i);
        }
    }
}
