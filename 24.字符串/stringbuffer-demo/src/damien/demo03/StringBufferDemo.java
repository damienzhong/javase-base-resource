package damien.demo03;

/**
 *  StringBuffer和String的相互转换
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        //String --> StringBuffer
        String s= "呆萌钟";
        //注意事项：不能把字符串的值直接赋值给StringBuffer
        //StringBuffer sb = "呆萌钟";
        //StringBuffer sb = s;
        //方式1：通过构造方法
        StringBuffer sb = new StringBuffer(s);
        //方式2：通过append()方法
        StringBuffer sb2 = new StringBuffer();
        sb2.append(s);
        System.out.println("sb:"+sb);
        System.out.println("sb2:"+sb2);
        System.out.println("--------------------------");

        //StringBuffer --> String
        StringBuffer sb3 = new StringBuffer("呆萌钟");
        //方式1：通过构造方法
        String s2 = new String(sb3);
        //方式2: 通过toString()方法
        String s3 = sb3.toString();
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
    }
}
