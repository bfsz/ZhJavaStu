package java_se.stu08.waitingForWakeUpMechanism;

/**
 * @author bfsz
 * @version 1.0
 * @description: 消费者
 * @date 2021/6/29 17:14
 */
public class GuKe extends Thread {
    private BaoZi bz;

    public GuKe(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("顾客正在吃：" + bz.pier + bz.xianer + "包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
