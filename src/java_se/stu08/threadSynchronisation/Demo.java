package java_se.stu08.threadSynchronisation;

/**
 * @author bfsz
 * @version 1.0
 * @description: 线程安全测试
 * @date 2021/6/29 15:29
 */
public class Demo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
