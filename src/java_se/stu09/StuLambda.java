package java_se.stu09;

/**
 * 注意：
 * 1. 使用Lambda必须具有接口，且要求**接口中有且仅有一个抽象方法。
 *  无论是JDK内置的`Runnable`、`Comparator`接口还是自定义的接口，只有当接口中的抽象方法存在且唯一时，才可以使用Lambda。
 * 2. 使用Lambda必须具有上下文推断。
 *  也就是方法的参数或局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实例。
 */

import java.util.Arrays;

/**
 * @author bfsz
 * @version 1.0
 * @description: Lambda 写法
 * @date 2021/6/30 8:20
 */
public class StuLambda {
    public static void main(String[] args) {
        lambdaDemo3();
    }

    /**
     * @description: Lambda的写法:(参数类型 参数名称) -> { 代码语句 }
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 8:22
     */
    static void lambdaDemo1() {
        new Thread(() -> System.out.println("多线程执行")).start();
    }

    /**
     * @description: Lambda的参数和返回值
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 8:39
     */
    static void lambdaDemo2() {
        Person[] array = {
                new Person("lo", 12),
                new Person("bf", 11),
                new Person("nh", 23),
        };
        Arrays.sort(array, (Person a, Person b) -> {
            return a.getAge() - b.getAge();
        });
        for (Person p : array) {
            System.out.println(p);
        }
    }

    /**
     * @description: ### 省略规则
     * 在Lambda标准格式的基础上，使用省略写法的规则为：
     * 1. 小括号内参数的类型可以省略；
     * 2. 如果小括号内有且仅有一个参，则小括号可以省略；
     * 3. 如果大括号内有且仅有一个语句，则无论是否有返回值，都可以省略大括号、return关键字及语句分号。
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 8:42
     */
    static void lambdaDemo3() {
        Person[] array = {
                new Person("lo", 12),
                new Person("bf", 11),
                new Person("nh", 23),
        };
        Arrays.sort(array, (a, b) -> a.getAge() - b.getAge());
        for (Person p : array) {
            System.out.println(p);
        }
    }
}
