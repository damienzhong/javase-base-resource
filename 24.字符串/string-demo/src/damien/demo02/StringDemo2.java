package damien.demo02;

/**
 * @author damienzhong
 * 题目：
 *      String s = new String("hello");与String s = "hello";的区别
 *
 * ==:比较引用类型比较的是地址值是否相同
 * equals：比较引用类型默认也是比较地址值是否相同，而String类重写了equeals()方法，比较的是内容是否相同
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";

        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
    }
}
