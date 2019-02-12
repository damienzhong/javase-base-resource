package damien.exception;

/**
 * JDK7之后出现多个异常的处理方式：
 *  try{
 *
 *  }catch(异常名 | 异常名2 | ... 变量){
 *
 *  }
 *
 *      注意：这个方法虽然简洁，但是也有缺点
 *          A：处理方式是一致的
 *          B：多个异常必须是平级关系
 */
public class ExceptionDemo4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[3]);
            System.out.println(a / b);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("程序出异常了");
        }

        System.out.println("程序执行完成");

    }
}
