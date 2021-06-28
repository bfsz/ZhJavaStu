package java_se.stu02;

/**
 * @author zhouhao
 * @version 1.0
 * @description: TODO
 * @date 2021/6/28 14:18
 */
public class Dog extends Animal {
    public Dog(String type, String name) {
        super(type, name);
    }

    public Dog() {
        super();
    }

    @Override
    public void cry() {
        System.out.println(super.getName() + " 是狗，发出汪汪叫");
    }
}
