package java_se.stu05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author bfsz
 * @version 1.0
 * @description: Collection 集合
 * @date 2021/6/29 9:44
 */
public class StuCollection {
    public static void main(String[] args) {
        UseIterator();
    }

    /**
     * @description: Collection 常用功能
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 9:50
     */
    private static void UseCollection() {
        // 创建集合对象
        Collection<String> strings = new ArrayList<String>();
        // 添加
        strings.add("lo");
        strings.add("ls");
        strings.add("lc");
        System.out.println(strings);
        // 判断是否在集合中
        boolean contains = strings.contains("ls");
        System.out.println(contains);
        // 删除集合中的某个元素
        boolean remove = strings.remove("ls");
        System.out.println(remove);
        System.out.println(strings);
        // 集合中元素个数
        int size = strings.size();
        System.out.println(size);
        // 将集合转为数组
        Object[] toArray = strings.toArray();
        for (Object s : toArray) {
            System.out.println(s);
        }
        // 清空集合
        strings.clear();
        System.out.println(strings);
        // 判断集合是否为空
        System.out.println(strings.isEmpty());
    }

    /**
     * @description: Iterator 迭代器
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 9:58
     */
    private static void UseIterator() {
        Collection<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        // Iterator迭代集合中元素
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        // 增强 for
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
