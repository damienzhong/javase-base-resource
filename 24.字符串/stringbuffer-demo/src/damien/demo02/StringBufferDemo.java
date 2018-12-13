package damien.demo02;

/**
 * StringBuffer的替换功能：
 * public StringBuffer replace(int start,int end,String str)：从start开始到end用str替换
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        //添加数据
        sb.append("hello");
        sb.append("world");
        sb.append("java");
        System.out.println("sb:" + sb);

        //public StringBuffer replace(int start,int end,String str)：从start开始到end用str替换
        //需求：把world数据替换为"呆萌钟"
        sb.replace(5,10,"呆萌钟");
        System.out.println("sb:" + sb);


    }
}
