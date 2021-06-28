package java_se.stu02;

/**
 * @author zhouhao
 * @version 1.0
 * @description: TODO
 * @date 2021/6/28 14:19
 */
public class Cat extends Animal {
    public Cat(String type, String name) {
        super(type, name);
    }

    public Cat() {

    }

    @Override
    public void cry() {
        System.out.println(super.getName() + " 是猫，发出喵叫");
    }
}
