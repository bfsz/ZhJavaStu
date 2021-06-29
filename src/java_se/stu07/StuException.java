package java_se.stu07;

/**
 * @author bfsz
 * @version 1.0
 * @description: 异常的处理
 * @date 2021/6/29 14:34
 */
public class StuException {
    public static void main(String[] args) throws MyException {
        myExceptionDemo();
    }

    /**
     * @description: 抛出异常 throw：抛出一个指定的异常对象
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 14:35
     */
    static void throwDemo() {
        //创建一个数组
        int[] arr = {2, 23, 1, 2};
        //根据索引找对应的元素
        int index = 4;
        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("角标越界了");
        }
        int element = arr[index];
        System.out.println(element);
    }

    /**
     * @description: 声明异常 throws：表示当前方法不处理异常,而是提醒该方法的调用者来处理异常(抛出异常)
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 14:39
     */
    static void throwsDemo() throws ArrayIndexOutOfBoundsException {
        //创建一个数组
        int[] arr = {2, 23, 1, 2};
        //根据索引找对应的元素
        int index = 4;
        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("角标越界了");
        }
        int element = arr[index];
        System.out.println(element);
    }

    /**
     * @description: 捕获异常try…catch。注意：多个异常一次捕获一次处理
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 14:44
     */
    static void tryCatchDemo() {
        try {
            //创建一个数组
            int[] arr = {2, 23, 1, 2};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + " 数组越界");
        }
        /*
         * finally：有一些特定的代码无论异常是否发生，都需要执行。
         * 另外，因为异常会引发程序跳转，导致有些语句执行不到。
         * 而finally就是解决这个问题的，在finally代码块中存放的代码都是一定会被执行的。
         * */ finally {
            System.out.println("无论如何都会执行");
        }
        System.out.println("结束");
    }

    /**
     * @description: 自定义异常
     * @param:
     * @return: void
     * @author bfsz
     * @date: 2021/6/29 14:54
     */
    static void myExceptionDemo() throws MyException {
        String[] names = {"ll", "ww", "ss"};
        String uname = "ll";
        for (String name : names) {
            if (name.equals(uname)) {//如果名字在这里面 就抛出登陆异常
                throw new MyException(name + "已经被注册了！");
            }
        }
    }
}
