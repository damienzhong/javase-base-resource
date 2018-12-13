package damien.demo01;

/**
 * StringBuffer的添加功能：
 *  public StringBuffer append(String str)：可以把任意类型的数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
 *  public StringBuffer insert(int offset,String str)：在指定位置把任意的数据插入到字符串缓冲区，并返回字符串缓冲区对象
 */
public class StringBufferDemo2 {
    public static void main(String[] args) {
        //创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();

        //public StringBuffer append(String str)
//        StringBuffer sb2 = sb.append("hello");
//        System.out.println("sb:"+sb);
//        System.out.println("sb2:"+sb2);
//        System.out.println(sb == sb2);

        //一步一步的添加数据
//        sb.append("呆萌钟");
//        sb.append(true);
//        sb.append(20);
//        sb.append(31.21);


        //链式编程
        sb.append("呆萌钟").append(true).append(20).append(31.21);
        System.out.println("sb:"+sb);

        //public StringBuffer insert(int offset,String str)：在指定位置把任意的数据插入到字符串缓冲区，并返回字符串缓冲区对象
        sb.insert(3,"好帅啊");
        System.out.println("sb:"+sb);
    }
}
