package damien.demo03;

/**
 * 判断功能：
 *  public boolean equals(Object anObject)：比较字符串的内容是否相同，区分大小写
 *  public boolean equalsIgnoreCase(String anotherString)：比较字符串的内容是否相同，忽略大小写
 *  public boolean contains(CharSequence s)：判断大字符串是否包含小字符串
 *  public boolean startsWith(String prefix)：判断字符串是否以某个制定的字符串开头
 *  public boolean endsWith(String suffix)：判断字符串是否以某个制定的字符串结尾
 *  public boolean isEmpty()：判断字符串是否为空。
 *
 *  注意：
 *      字符串内容为空和字符串对象为空。
 *      String s = "";
 *      String s = null;
 */
public class StringDemo {
    public static void main(String[] args) {
        //创建字符串对象
        String s1 = "helloworld";
        String s2 = "helloworld";
        String s3 = "helloWorld";

        //public boolean equals(Object anObject)：比较字符串的内容是否相同，区分大小写
        System.out.println("equals:"+s1.equals(s2));
        System.out.println("equals:"+s1.equals(s3));
        System.out.println("--------------------------");

        //public boolean equalsIgnoreCase(String anotherString)：比较字符串的内容是否相同，忽略大小写
        System.out.println("equalsIgnoreCase:"+s1.equalsIgnoreCase(s2));
        System.out.println("equalsIgnoreCase:"+s1.equalsIgnoreCase(s3));
        System.out.println("--------------------------");

        //public boolean contains(CharSequence s)：判断大字符串是否包含小字符串
        System.out.println("contains:"+s1.contains("hello"));
        System.out.println("contains:"+s1.contains("hw"));
        System.out.println("--------------------------");

        //public boolean startsWith(String prefix)：判断字符串是否以某个制定的字符串开头
        System.out.println("startsWith:"+s1.startsWith("h"));
        System.out.println("startsWith:"+s1.startsWith("hello"));
        System.out.println("startsWith:"+s1.startsWith("world"));
        System.out.println("--------------------------");

        //public boolean endsWith(String suffix)：判断字符串是否以某个制定的字符串结尾   自己练习

        //public boolean isEmpty()：判断字符串是否为空。
        System.out.println("isEmpty:"+s1.isEmpty());

        String s4 = "";
        String s5 = null;
        System.out.println("isEmpty:"+s4.isEmpty());
        //NullPointerException
        //s5对象都不存在，所以不能调用方法，空指针异常
        System.out.println("isEmpty:"+s5.isEmpty());
    }
}
