package java_se.stu14;

import java.io.*;

/**
 * @author bfsz
 * @version 1.0
 * @description: 序列化：用一个字节序列可以表示一个对象，该字节序列包含该`对象的数据`、`对象的类型`和`对象中存储的属性`等信息
 * @date 2021/6/30 14:12
 */
public class StuSerialisation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        objectInputStreamDemo();
    }

    /**
     * @description: 序列化操作
     * `java.io.ObjectOutputStream ` 类，将Java对象的原始数据类型写出到文件,实现对象的持久存储。
     * 构造方法
     * - `public ObjectOutputStream(OutputStream out) `： 创建一个指定OutputStream的ObjectOutputStream。
     * 1. 一个对象要想序列化，必须满足两个条件:
     * - 该类必须实现`java.io.Serializable ` 接口，`Serializable` 是一个标记接口，不实现此接口的类将不会使任何状态序列化或反序列化，会抛出`NotSerializableException` 。
     * - 该类的所有属性必须是可序列化的。如果有一个属性不需要可序列化的，则该属性必须注明是瞬态的，使用`transient` 关键字修饰。
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 14:18
     */
    static void objectOutputStreamDemo() {
        User user = new User("lisi", "zunyi", 20);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu14\\user.txt"));
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
            System.out.println("序列化数据已保存");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @description: 反序列化操作
     * ObjectInputStream反序列化流，将之前使用ObjectOutputStream序列化的原始数据恢复为对象。
     * 构造方法
     * - `public ObjectInputStream(InputStream in) `： 创建一个指定InputStream的ObjectInputStream。
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 14:30
     */
    static void objectInputStreamDemo() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:\\IdeaProjects\\ZhJavaStu\\src\\java_se\\stu14\\user.txt"));
        User user = (User) objectInputStream.readObject();
        System.out.println(user.name + "-" + user.address);
        objectInputStream.close();
    }
}
