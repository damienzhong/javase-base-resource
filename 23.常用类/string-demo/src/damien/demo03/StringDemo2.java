package damien.demo03;

/**
 * String类的获取功能：
 *  public int length()：获取字符串的长度
 *  public char charAt(int index)：获取指定索引位置的字符
 *  public int indexOf(int ch)：返回指定字符在此字符串中第一次出现的索引
 *      为什么这里是int类型，而不是char类型？
 *      原因：'a'和97其实都可以代表'a'
 *  public int indexOf(String str):返回指定字符串在此字符串中第一次出现的索引
 *  public int indexOf(int ch,int fromIndex)：返回指定字符在此字符串中从指定位置后第一次出现处的索引
 *  public int indexOf(String str,int fromIndex)：返回指定字符串在此字符串中从指定位置后第一次出现处的索引
 *  public String substring(int beginIndex)：从指定位置开始截取字符串，默认到末尾
 *  public String substring(int beginIndex,int endIndex)：从指定位置开始到指定位置结束截取字符串。
 */
public class StringDemo2 {
    public static void main(String[] args) {
        //定义一个字符串对象
        String s = "helloworld";

        //public int length()：获取字符串的长度
        System.out.println("s.length:"+s.length());
        System.out.println("-------------------");

        //public char charAt(int index)：获取指定索引位置的字符
        System.out.println("charAt:"+s.charAt(1));
        System.out.println("-------------------");

        //public int indexOf(int ch)：返回指定字符在此字符串中第一次出现的索引
        System.out.println("indexOf:"+s.indexOf('l'));
        System.out.println("-------------------");

        //public int indexOf(String str):返回指定字符串在此字符串中第一次出现的索引
        System.out.println("indexOf:"+s.indexOf("owo"));
        System.out.println("-------------------");

        //public int indexOf(int ch,int fromIndex)：返回指定字符在此字符串中从指定位置后第一次出现处的索引
        System.out.println("indexOf:"+s.indexOf('l',4));
        System.out.println("indexOf:"+s.indexOf('k',4));
        System.out.println("indexOf:"+s.indexOf('l',40));
        System.out.println("-------------------");

        //public int indexOf(String str,int fromIndex)：返回指定字符串在此字符串中从指定位置后第一次出现处的索引   自己练习

        //public String substring(int beginIndex)：从指定位置开始截取字符串，默认到末尾
        System.out.println("substring:"+s.substring(5));
        System.out.println("substring:"+s.substring(0));
        System.out.println("-------------------");
        //public String substring(int beginIndex,int endIndex)：从指定位置开始到指定位置结束截取字符串。
        System.out.println("substring:"+s.substring(1,5));
    }
}
