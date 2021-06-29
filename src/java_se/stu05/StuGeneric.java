package java_se.stu05;

/**
 * @author bfsz
 * @version 1.0
 * @description: 泛型
 * @date 2021/6/29 10:03
 */
public class StuGeneric {
    public static void main(String[] args) {
        StuGenericClass<String> stringStuGenericClass = new StuGenericClass<String>();
        stringStuGenericClass.setM("测试");
        String m = stringStuGenericClass.getM();
        System.out.println(m);

        StuGenericClass<Integer> stringStuGenericClass1 = new StuGenericClass<Integer>();
        stringStuGenericClass1.setM(1);
        Integer m1 = stringStuGenericClass1.getM();
        System.out.println(m1);

        StuGenericMethod stuGenericMethod = new StuGenericMethod();
        stuGenericMethod.show1(1);
        stuGenericMethod.show1("2");
        stuGenericMethod.show1(1.2);
    }
}
