package java_se.stu14;

import java.io.Serializable;

/**
 * @author bfsz
 * @version 1.0
 * @description: TODO
 * @date 2021/6/30 14:21
 */
public class User implements Serializable {
    public String name;
    public String address;
    public transient int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public User(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public void addressCheck() {
        System.out.println(name + "--" + address);
    }
}
