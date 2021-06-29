package java_se.stu08.threadSynchronisation;

/**
 * @author BFSZ
 * @version 1.0
 * @description: 模拟票
 * @date 2021/6/29 15:22
 */
public class Ticket implements Runnable {
    private int ticket = 100;
    Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) { //同步代码块： synchronized 关键字可以用于方法中的某个区块中，表示只对这个区块的资源实行互斥访问
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
    }
}
