package java_se.stu16;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author bfsz
 * @version 1.0
 * @description: Stream流
 * @date 2021/6/30 15:16
 */
public class StuStream {
    public static void main(String[] args) {
        streamCommonMethods();
    }

    /**
     * @description: 获取流、过滤姓张、过滤长度为3、逐一打印
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 15:17
     */
    static void streamFilterDemo() {
        List<String> list = new ArrayList<>();
        list.add("张11");
        list.add("周22");
        list.add("赵1");
        list.add("张1");
        list.add("张33");

        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(System.out::println);
    }

    /**
     * java.util.stream.Stream<T> 是Java 8新加入的最常用的流接口。（这并不是一个函数式接口。）
     * 获取一个流非常简单，有以下几种常用的方式：
     * 所有的 Collection 集合都可以通过 stream 默认方法获取流；
     * Stream 接口的静态方法 of 可以获取数组对应的流。
     * */

    /**
     * @description: 获取流
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 15:21
     */
    static void getStream() {
        // 根据Collection获取流
        ArrayList<String> arrayList = new ArrayList<>();
        Stream<String> stream = arrayList.stream();

        HashSet<String> hashSet = new HashSet<>();
        Stream<String> stream1 = hashSet.stream();

        Vector<String> vector = new Vector<>();
        Stream<String> stream2 = vector.stream();

        // 根据Map获取流
        HashMap<String, String> hashMap = new HashMap<>();
        Stream<String> stream3 = hashMap.keySet().stream();
        Stream<String> stream4 = hashMap.values().stream();
        Stream<Map.Entry<String, String>> stream5 = hashMap.entrySet().stream();

        // 根据数组获取流
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        Stream<Integer> stream6 = Stream.of(arr);
        stream6.filter(integer -> integer > 4).forEach(System.out::println);
    }

    /**
     * @description: 常用方法
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/30 15:29
     */
    static void streamCommonMethods() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        long count = strings.stream().count();
        System.out.println("统计个数：" + count);

        count = strings.stream().filter(s -> s.length() == 3).count();
        System.out.println("字符长度为3的个数：" + count);

        List<String> filtered = new ArrayList<>();
        filtered = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选后的列表：" + filtered);

        String mergedString = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并筛选后的字符串：" + mergedString);

        // map 方法用于映射每个元素到对应的结果，以下代码片段使用 map 输出了元素对应的平方数
        List<Integer> list = numbers.stream().map(integer -> integer * integer).distinct().sorted().collect(Collectors.toList());
        System.out.println("获取对应的平方数："+list);

    }
}
