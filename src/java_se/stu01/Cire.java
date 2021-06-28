package java_se.stu01;

/**
 * @author zhouhao
 * @version 1.0
 * @description: 接口实现类
 * @date 2021/6/28 14:08
 */
public class Cire implements CireInterface{
    @Override
    public float getArea(float r) {
        return PI*r*r;
    }

    @Override
    public float getCircumference(float r) {
        return 2*PI*r;
    }
}
