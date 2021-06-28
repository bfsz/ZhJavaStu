package java_se.stu02;

/**
 * @author zhouhao
 * @version 1.0
 * @description: 类的继承、重写、重载、多态
 * @date 2021/6/28 14:15
 */
public class Animal {
    private String type;
    private String name;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void cry(){
        System.out.println(this.name+" 发出叫声！");
    }
}
