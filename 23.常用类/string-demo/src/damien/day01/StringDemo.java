package damien.day01;


/**
 * 字符串：就是由多个字符组成的一串数据，也可以看出是一个字符数组。
 *
 * 通过查看API，我们可以知道：
 *      A：字符串字面值"abc"，也可以看成是一个字符串对象
 *      B: 字符串是常量，一旦被赋值，就不能改变
 *构造方法：
 *      public String()：空构造
 *      public String(byte[] bytes):把字节数组转成字符串
 *      public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
 *      public String(char[] value):把字符数组转成字符串
 *      public String(char[] value,int offset,int count):把字符数组的一部分转成字符串
 *      public String(String original):把字符串常量转成字符串
 *
 * 字符串长度方法：
 *      public int length():返回字符串的长度
 */
public class StringDemo {
    public static void main(String[] args) {
        //public String()：空构造
        String s1 = new String();//String s1="";
        System.out.println("s1:"+s1);
        System.out.println("s1.length:"+s1.length());
        System.out.println("---------------------");
        //public String(byte[] bytes):把字节数组转成字符串
        byte[] byteArr = {97,98,99,100,101};//ASCII
        String s2 = new String(byteArr);
        System.out.println("s2:"+s2);
        System.out.println("s2.length:"+s2.length());
        System.out.println("---------------------");
        //public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
        String s3 = new String(byteArr,1,3);
        System.out.println("s3:"+s3);
        System.out.println("s3.length:"+s3.length());
        System.out.println("---------------------");
        //public String(char[] value):把字符数组转成字符串
        char[] chArr = {'a','b','c','d','e','呆','萌','钟'};
        String s4 = new String(chArr);
        System.out.println("s4:"+s4);
        System.out.println("s4.length:"+s4.length());
        System.out.println("---------------------");
        //public String(char[] value,int offset,int count):把字符数组的一部分转成字符串
        String s5 = new String(chArr, 5, 3);
        System.out.println("s5:"+s5);
        System.out.println("s5.length:"+s5.length());
        System.out.println("---------------------");
        //public String(String original):把字符串常量转成字符串
        String s6 = new String("呆萌钟");//String s="呆萌钟";
        System.out.println("s6:"+s6);
        System.out.println("s6.length:"+s6.length());
    }
}
