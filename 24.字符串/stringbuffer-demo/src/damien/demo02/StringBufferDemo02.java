package damien.demo02;

/**
 * StringBuffer的反转功能：
 *  public StringBuffer reverse()
 */
public class StringBufferDemo02 {
    public static void main(String[] args) {
        //创建字符串缓冲区
        StringBuffer sb = new StringBuffer();

        //添加数据
        sb.append("呆萌钟帅死");
        System.out.println("sb:" + sb);

        //public StringBuffer reverse()
        sb.reverse();
        System.out.println("sb:" + sb);
    }
}
