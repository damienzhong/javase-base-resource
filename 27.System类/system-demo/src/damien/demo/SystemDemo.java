package damien.demo;

/**
 *  System类包含一些有用的类字段和方法。它不能被实例化。
 *
 *  方法：
 *      public static void gc():运行垃圾回收器
 *      public static void exit(int status)
 *      public static long currentTimeMillis()
 */
public class SystemDemo {
    public static void main(String[] args) {
//        System.err.println("错误信息");
//        System.out.println("普通信息");
        Student student = new Student("呆萌钟", 25);
        System.out.println(student);
        Teacher teacher = new Teacher();
        System.out.println(teacher);

        student = null;
        teacher = null;
        System.gc();
    }
}
