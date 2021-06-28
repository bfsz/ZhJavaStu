package java_se.stu04;

/**
 * @author zhouhao
 * @version 1.0
 * @description: 局部内部类
 * @date 2021/6/28 14:47
 */
public class SellOutClass {
    private final String name;

    public SellOutClass() {
        name = "apple";
    }

    public void sell(int price) {
        class Apple {       // 局部内部类
            int innerPrice = 0;

            public Apple(int price) {
                innerPrice = price;
            }

            public void price() {
                System.out.println("销售：" + name);
                System.out.println("单价：" + innerPrice + " 元");
            }
        }
        Apple apple = new Apple(price);
        apple.price();
    }

    public static void main(String[] args) {
        SellOutClass sellOutClass = new SellOutClass();
        sellOutClass.sell(1000);
    }
}
