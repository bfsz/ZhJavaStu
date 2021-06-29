package java_se.stu07;

/**
 * @author BFSZ
 * @version 1.0
 * @description: 自定义异常
 * @date 2021/6/29 14:51
 */
public class MyException extends Exception {
    public MyException() {

    }

    public MyException(String msg) {
        super(msg);
    }
}
