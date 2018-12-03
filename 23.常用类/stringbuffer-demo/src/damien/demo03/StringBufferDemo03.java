package damien.demo03;

/**
 *  面试题：
 *      1、String、StringBuffer、StringBuilder的区别？
 *
 *      2、StringBuffer与数组的区别？
 *
 *      3、形式参数问题
 *          String作为参数传递
 *          StringBuffer作为参数传递
 *
 *      参数类型：
 *          基本类型：
 *          引用类型：
 */
public class StringBufferDemo03 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + "---" + s2);
        change(s1,s2);
        System.out.println(s1 + "---" + s2);

        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1 + "---" + sb2);
        change(sb1,sb2);
        System.out.println(sb1 + "---" + sb2);
    }

    private static void change(StringBuffer sb1, StringBuffer sb2) {
        sb1 = sb2;
        sb2.append(sb1);
    }

    public static void change(String s1,String s2){
        s1 = s2;
        s2 = s1 + s2;
    }
}
