package damien.demo02;

/**
 * 看程序写结果
 * 字符串如果是变量想加，先开空间，再拼接
 * 字符串常量相加，是先加，然后再常量池中找，如果有就直接返回，否则，就创建
 */
public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        System.out.println(s3 == s1 + s2);//false
        System.out.println(s3.equals((s1 + s2)));//true
        System.out.println(s3 == "hello" + "world");//true
        System.out.println(s3.equals("hello" + "world"));//true
    }
}
