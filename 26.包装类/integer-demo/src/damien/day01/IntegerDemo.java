package damien.day01;

/**
 *  需求1：把100这个数的二进制，八进制，十六进制计算出来
 *  需求2：判断一个数据是否在int范围内？
 *
 *  为了对基本数据类型进行更多的操作，更方便的操作，Java就针对每一种基本数据类型提供了对应的类类型，称为包装类类型
 *      byte    Byte
 *      short   Short
 *      int     Integer
 *      long    Long
 *      float   Float
 *      double  Double
 *      char    Character
 *      boolean Boolean
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //public static String toBinaryString(int i)
        System.out.println(Integer.toBinaryString(100));
        //public static String toOctalString(int i)
        System.out.println(Integer.toOctalString(100));
        //public static String toHexString(int i)
        System.out.println(Integer.toHexString(100));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
