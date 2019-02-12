package damien.exception;

/**
 * A:一个异常
 * B:两个异常
 *      a:每一个写一个try...catch
 *      b:写一个try,多个catch
 *          try{
 *
 *          }catch(异常名 变量名){
 *              ...
 *          }catch(异常名 变量名){
 *              ...
 *          }
 *          ....
 *
 *          注意事项：
 *              1：能明确的尽量明确 ，不要用大的处理
 *              2：平级关系的异常税钱谁前谁后无所谓，如果出现了子父关系，父必须在后面
 *
 *  注意：
 *      一旦try里面出现了问题，就会把对应的问题抛出去，然后和catch里面的问题进行匹配，
 *      一旦匹配成功，就执行catch里面的处理，然后结束了try...catch
 *      继续执行后面的语句
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        //method1();
        //method2();
        method3();
    }

    private static void method3() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[3]);
            System.out.println(a / b);
            System.out.println("这里会出现一个异常，但是具体异常我不清楚");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界异常");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (RuntimeException e){
            System.out.println("出现运行时异常问题了");
        }catch (Exception e){
            System.out.println("出问题了");
        }

        System.out.println("程序执行完成");
    }


    private static void method2() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }

        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界异常");
        }

        System.out.println("程序执行完成");
    }

    private static void method1() {
        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }

        System.out.println("程序执行完成");
    }

}
