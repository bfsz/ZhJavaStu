package java_se.stu06;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bfsz
 * @version 1.0
 * @description: Map集合【HashMap<K,V>、LinkedHashMap<K,V>】：每个元素由键与值两部分组成，通过键可以找对所对应的值；Map中的集合不能包含重复的键，值可以重复；每个键只能对应一个值。
 * @date 2021/6/29 11:11
 */
public class StuMap {
    public static void main(String[] args) {
        LinkedHashMapDemo();
    }

    /**
     * @description: Map接口中的常用方法
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 11:19
     */
    static void MapDemo() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println(map);

        // 删除
        System.out.println(map.remove(1));
        System.out.println(map);

        // 查看
        System.out.println(map.get(2));

        // 遍历键找值方式
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            String s = map.get(key);
            System.out.println(key + "-" + s);
        }

        // 遍历键值对方式
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-" + value);
        }
    }

    /**
     * @description: HashMap存储自定义类型键值；保证对象唯一，必须复写对象的hashCode和equals方法；成对元素唯一，查询速度很快，无序
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 11:33
     */
    static void HashMapDemo() {
        HashMap<Student, String> studentHashMap = new HashMap<>();
        studentHashMap.put(new Student("ll", 11), "贵阳");
        studentHashMap.put(new Student("ss", 23), "遵义");
        studentHashMap.put(new Student("dd", 12), "安顺");
        Set<Map.Entry<Student, String>> entries = studentHashMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key.toString() + " - " + value);
        }
    }

    /**
     * @description: LinkedHashMap，它是链表和哈希表组合的一个数据存储结构;有序、速度快
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 11:39
     */
    static void LinkedHashMapDemo() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1", "a");
        linkedHashMap.put("2", "b");
        linkedHashMap.put("3", "c");
        Set<Map.Entry<String, String>> entries = linkedHashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
