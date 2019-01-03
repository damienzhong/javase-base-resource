package damien.demo03;

/**
 *  面试题：
 *      1、String、StringBuffer、StringBuilder的区别？
 *          A:String是内容不可变的，StringBuffer、StringBuilder都是内容可变的
 *          B:StringBuffer是同步的，数据安全，效率较低;StringBuilder是不同步，数据不安全，效率更高
 *
 *      2、StringBuffer与数组的区别？
 *          二者都可以看成是一个容器，用于装载其他数据。
 *          但是，StringBuffer的数据最终是一个字符串数据。
 *          而数组可以放置多种数据，但必须是同一种数据类型
 *
 *      3、形式参数问题
 *          String作为参数传递
 *          StringBuffer作为参数传递
 *
 *      参数类型：
 *          基本类型：形式参数的改变不影响实际参数
 *          引用类型：形式参数的改变直接影响实际参数
 *
 *  注意：
 *      String作为参数传递，效果和基本数据类型作为参数传递是一样的
 */
public class StringBufferDemo02 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + "---" + s2);//hello---world
        change(s1,s2);
        System.out.println(s1 + "---" + s2);//hello---world

        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1 + "---" + sb2);//hello---world
        change(sb1,sb2);
        System.out.println(sb1 + "---" + sb2);//hello---worldworld
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
