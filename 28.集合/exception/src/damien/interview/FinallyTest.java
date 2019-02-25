package damien.interview;

/**
 * 如果catch里面有return语句，请问finally里面的代码还会执行吗？
 * 如果会，请问是在return前还是return后？
 *  会，前
 */
public class FinallyTest {
    public static void main(String[] args) {
        System.out.println(getInt());
    }

    public static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
            /*
             * return a在程序执行到这一步的时候，这里不是return a而是return 30;这个返回路径就形成了，
             * 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40;
             * 再次回到以前的返回路径，继续走retrun 30;
             */
        } finally {
            a = 40;
        }
        return a;
    }
}
