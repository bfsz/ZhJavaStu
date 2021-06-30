package java_se.stu09;

import java.util.function.Supplier;

/**
 * @author BFSZ
 * @version 1.0
 * @description: 常用函数式接口
 * @date 2021/6/30 15:03
 */
public class StuCommonFunctionalInterfaces {
    public static void main(String[] args) {
        supplierDemo2();
    }

    /**-------------------Supplier接口------------------*/
    //定一个方法,方法的参数传递Supplier,泛型使用String
    private static String getString(Supplier<String> f) {
        return f.get();
    }

    //定一个方法,方法的参数传递Supplier,泛型使用Integer
    private static Integer getMax(Supplier<Integer> f) {
        return f.get();
    }

    public static void supplierDemo1() {
        String msgA = "hello";
        String msgB = "world";
        System.out.println(getString(() -> msgA + msgB));
    }

    public static void supplierDemo2() {
        int arr[] = {1, 23, 43, 12, 13, 1, 21};
        int maxNum = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxNum);
    }
}
