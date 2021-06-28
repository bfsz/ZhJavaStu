package java_se.stu03;

/**
 * @author zhouhao
 * @version 1.0
 * @description: 继承抽象类，实现方法
 * @date 2021/6/28 14:34
 */
public class Orange extends Fruit{

    @Override
    public void harvest() {
        System.out.println("实现方法,橘子已收获");
    }
}
