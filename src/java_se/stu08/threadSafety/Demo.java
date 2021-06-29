package java_se.stu08.threadSafety;

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
        /*
         * 线程安全问题都是由全局变量及静态变量引起的。若每个线程中对全局变量、静态变量只有读操作，而无写
         * 操作，一般来说，这个全局变量是线程安全的；若有多个线程同时执行写操作，一般都需要考虑线程同步，
         * 否则的话就可能影响线程安全。
         * */
    }
}
