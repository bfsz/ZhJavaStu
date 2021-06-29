package java_se.stu08.synchronisationMethods;

/**
 * @author BFSZ
 * @version 1.0
 * @description: 模拟票
 * @date 2021/6/29 15:22
 */
public class Ticket implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            sellTicket();
        }
    }

    /**
     * @description: 同步方法:使用synchronized修饰的方法,就叫做同步方法,保证A线程执行该方法的时候,其他线程只能在方法外等着。
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 16:07
     */
    public synchronized void sellTicket() {
        if (ticket > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
            System.out.println(name + "正在卖：" + ticket--);
        }
    }
}
