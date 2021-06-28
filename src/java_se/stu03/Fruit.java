package java_se.stu03;

/**
 * @author zhouhao
 * @version 1.0
 * @description: 抽象类
 * @date 2021/6/28 14:30
 */
public abstract class Fruit {
    /*
     * 声明方法存在不去具体实现，不能被实例化
     * */
    public String color; //成员变量

    // 定义构造方法
    public Fruit() {
        color = "red";
    }

    // 定义抽象方法
    public abstract void harvest();
}
