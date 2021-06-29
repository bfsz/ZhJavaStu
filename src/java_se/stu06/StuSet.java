package java_se.stu06;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author bfsz
 * @version 1.0
 * @description: Set接口：元素无序、不重复 ;【HashSet、LinkedHashSet】;遍历：迭代器、增强for
 * @date 2021/6/29 10:48
 */
public class StuSet {
    public static void main(String[] args) {
        LinkedHashSetDemo();
    }

    /**
     * @description: HashSet 是根据对象的哈希值来确定元素在集合中的存储位置，因此具有良好的存取和查找性能
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 10:56
     */
    static void HashSetDemo() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("b");
        hashSet.add("c");
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

    /**
     * @description: HashSet中存放自定义类型元素
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 11:00
     */
    static void HashSetDemo2() {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("a", 11));
        students.add(new Student("b", 13));
        students.add(new Student("c", 16));
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    /**
     * @description: LinkedHashSet：有序
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 11:05
     */
    static void LinkedHashSetDemo() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("b");
        linkedHashSet.add("d");
        linkedHashSet.add("c");
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
