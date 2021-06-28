package java_se.stu03;

/**
 * @author zhouhao
 * @version 1.0
 * @description: 抽象类测试
 * @date 2021/6/28 14:34
 */
public class FarmTest {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        apple.harvest();
        orange.harvest();
    }
}
