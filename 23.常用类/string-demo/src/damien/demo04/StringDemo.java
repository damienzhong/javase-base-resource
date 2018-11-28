package damien.demo04;

/**
 * String的转换功能：
 * public byte[] getBytes()：把字符串转换成字节数组
 * public char[] toCharArray()：将此字符串转换为一个新的字符数组。
 * public static String valueOf(char[] data)：把字符数组转成字符串
 * public static String valueOf(int i)：把int类型的数据转成字符串
 * 注意：String类的valueOf方法可以把任意类型数据转成字符串
 * public String toLowerCase()：把字符串转成小写
 * public String toUpperCase()：把字符串转成大写
 * public String concat(String str)：把字符串拼接
 */
public class StringDemo {
    public static void main(String[] args) {
        //定义字符串
        String s = "JavaSE";

        //public byte[] getBytes()：把字符串转换成字节数组
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("---------------------");

        //public char[] toCharArray()：将此字符串转换为一个新的字符数组。
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("---------------------");

        //public static String valueOf(char[] data)：把字符数组转成字符串
        String s1 = String.valueOf(chars);
        System.out.println(s1);
        System.out.println("---------------------");

        //public static String valueOf(int i)：把int类型的数据转成字符串
        int i = 100;
        String s2 = String.valueOf(i);
        System.out.println(s2);
        System.out.println("---------------------");

        //public String toLowerCase()：把字符串转成小写
        System.out.println("s.toLowerCase():"+s.toLowerCase());
        System.out.println("s:"+s);
        System.out.println("---------------------");

        //public String toUpperCase(Locale locale)：把字符串转成大写
        System.out.println("s.toUpperCase():"+s.toUpperCase());
        System.out.println("s:"+s);
        System.out.println("---------------------");

        //public String concat(String str)：把字符串拼接
        String ss = "hello";
        String ss2 = "world";
        String ss3 = ss + ss2;
        String ss4 = ss.concat(ss2);
        System.out.println(ss3);
        System.out.println(ss4);
    }
}
