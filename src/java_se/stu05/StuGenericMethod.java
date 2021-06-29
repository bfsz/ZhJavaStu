package java_se.stu05;

/**
 * @author zhouhao
 * @version 1.0
 * @description: 含有泛型的方法
 * @date 2021/6/29 10:12
 */
public class StuGenericMethod {
    public <M> void show1(M m) {
        System.out.println(m.getClass());
    }

    public <M> M show2(M m) {
        return m;
    }
}
