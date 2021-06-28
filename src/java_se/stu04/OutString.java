package java_se.stu04;

/**
 * @author zhouhao
 * @version 1.0
 * @description: 匿名内部类
 * @date 2021/6/28 14:55
 */
public class OutString {
    public static void main(String[] args) {
        final String STR = "我 是 一盒 饼";
        IStringDeal iStringDeal = new IStringDeal() {   // 匿名内部类

            @Override
            public String filterBlankChar() {
                return STR.replace(" ", "");
            }
        };
        System.out.println("原字符串:" + STR);
        System.out.println("转换后字符串:" + iStringDeal.filterBlankChar());
    }
}
