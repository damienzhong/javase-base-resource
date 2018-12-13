package damien.day02;

/**
 * Integer的构造方法：
 * public Integer(int value)
 * public Integer(String s)
 *      注意：这个字符串必须是由数字字符组成
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //public Integer(int value)
        int i = 10;
        Integer num = new Integer(i);
        System.out.println(num);
        System.out.println("------------------------");
        //public Integer(String s)
        String s = "100";
        //String s2 = "abc";
        //NumberFormatException
        //Integer integer2 = new Integer(s2);
        Integer integer = new Integer(s);
        System.out.println(integer);
        //System.out.println(integer2);
    }
}
