package java_se.stu08.threadSafety;

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
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖：" + ticket--);
            }
        }
    }
}
