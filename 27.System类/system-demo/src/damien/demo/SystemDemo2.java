package damien.demo;

/**
 * System类包含一些有用的类字段和方法。它不能被实例化。
 * <p>
 * 方法：
 * public static void gc():运行垃圾回收器
 * public static void exit(int status)终止当前正在运行的java虚拟机。该参数作为状态代码；按惯例，一个非零状态码表示异常终止。
 * public static long currentTimeMillis()返回当前时间以毫秒为单位
 */
public class SystemDemo2 {
    public static void main(String[] args) {
//        System.out.println("女生扮男生~");
//        System.exit(0);
//        System.out.println("男生扮女生~");

        long start = System.currentTimeMillis();
        System.out.println(start);
        for (int i = 0; i < 10000; i++) {
            for(int j=0;j<1000;j++){
            int num = i+j;
        }
    }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end - start);
    }
}
