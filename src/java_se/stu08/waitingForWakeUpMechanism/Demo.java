package java_se.stu08.waitingForWakeUpMechanism;

/**
 * @author bfsz
 * @version 1.0
 * @description: 测试
 * @date 2021/6/29 17:19
 */
public class Demo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        GuKe guKe = new GuKe("LISI", bz);
        BaoZiPu baoZiPu = new BaoZiPu("店铺", bz);
        guKe.start();
        baoZiPu.start();
    }
}
