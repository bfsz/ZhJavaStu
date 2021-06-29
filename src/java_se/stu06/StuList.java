package java_se.stu06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author bfsz
 * @version 1.0
 * @description: List集合：有序、元素可重复、有索引
 * @date 2021/6/29 10:29
 */
public class StuList {
    public static void main(String[] args) {
        LinkedListDemo();
    }

    /**
     * @description: List接口中常用方法，ArrayList集合[数组结构]：元素增删慢，查找快
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 10:39
     */
    static void ListDemo() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        // 指定位置添加元素
        list.add(1, "d");
        // 指定位置删除元素
        System.out.println(list.remove(2));
        System.out.println(list);
        // 指定位置修改元素
        list.set(1, "233");
        System.out.println(list);
        // 指定位置元素获取
        System.out.println(list.get(1));
        // 遍历
        for (String s : list) {
            System.out.println(s);
        }
    }

    /**
     * @description: LinkedList集合[链表结构]:增删快，查询慢。可以作为堆栈，队列的结构使用
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 10:41
     */
    static void LinkedListDemo() {
        LinkedList<String> link = new LinkedList<>();
        link.add("a");
        link.add("b");
        link.add("c");
        System.out.println(link);
        // 获取
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        // 删除
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());

        while (!link.isEmpty()) {//判断集合是否为空
            System.out.println(link.pop()); //弹出集合中的栈顶元素
        }

        System.out.println(link);
    }
}
