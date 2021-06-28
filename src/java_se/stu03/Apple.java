package java_se.stu03;

/**
 * @author zhouhao
 * @version 1.0
 * @description: 继承抽象类，实现方法
 * @date 2021/6/28 14:33
 */
public class Apple extends Fruit {
    @Override
    public void harvest() {
        System.out.println("实现方法,苹果已收获");
    }
}
