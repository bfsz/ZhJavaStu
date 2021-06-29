package java_se.stu05;

/**
 * @author zhouhao
 * @version 1.0
 * @description: 自定义泛型类
 * @date 2021/6/29 10:06
 */
public class StuGenericClass<M> {
    private M m;

    public void setM(M m) {
        this.m = m;
    }

    public M getM() {
        return m;
    }
}
