package java_se.stu04;

/**
 * @author zhouhao
 * @version 1.0
 * @description: 成员内部类
 * @date 2021/6/28 14:37
 */
public class OuterClass {               //外部类
    private int x;

    class InnerClass {                  //内部类
        // 可使用外部类的成员方法、变量
        private int x = 9;

        public void dois(int x) {
            x++; //形参X
            this.x++; //内部类X
            OuterClass.this.x++; // 外部类X
        }
    }
}
