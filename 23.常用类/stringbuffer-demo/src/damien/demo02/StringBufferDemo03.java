package damien.demo02;

/**
 * StringBuffer的截取功能：注意：返回值类型不再是StringBuffer本身了
 * public String substring(int start)
 * public String substring(int start,int end)
 */
public class StringBufferDemo03 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        //添加数据
        sb.append("hello").append("world").append("java");
        System.out.println("sb:" + sb);

        //public String substring(int start)
        String s = sb.substring(5);
        System.out.println("s:" + s);
        System.out.println("sb:" + sb);

        //public String substring(int start,int end)
        String s2 = sb.substring(5,10);
        System.out.println("s2:" + s2);
        System.out.println("sb:" + sb);

    }
}
