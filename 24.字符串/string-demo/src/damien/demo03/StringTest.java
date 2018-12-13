package damien.demo03;

/**
 * 需求：遍历获取字符串中的每一个字符
 *
 * 分析：
 *      A:如何能够拿到每一个字符？
 *          char charAt(int index)
 *      B:我们要知道字符串的长度
 *          int length()
 */
public class StringTest {
    public static void main(String[] args) {
        //定义字符串
        String s = "helloworld";

        //原始版本
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(3));
//        System.out.println(s.charAt(4));
//        System.out.println(s.charAt(5));
//        System.out.println(s.charAt(6));
//        System.out.println(s.charAt(7));
//        System.out.println(s.charAt(8));
//        System.out.println(s.charAt(9));

//        for(int i = 0;i<10;i++){
//            System.out.println(s.charAt(i));
//        }

        for(int i = 0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
