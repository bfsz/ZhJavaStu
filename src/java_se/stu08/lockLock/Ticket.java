package java_se.stu08.lockLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author BFSZ
 * @version 1.0
 * @description: java.util.concurrent.locks.Lock 机制提供了比synchronized代码块和synchronized方法更广泛的锁定操作,
 * 同步代码块/同步方法具有的功能Lock都有,除此之外更强大,更体现面向对象。
 * @date 2021/6/29 15:22
 */
public class Ticket implements Runnable {
    private int ticket = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();//加同步锁
            if (ticket > 0) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖：" + ticket--);
            }
            lock.unlock();//释放同步锁
        }
    }
}
