package damien.interview;

/**
 * 如果catch里面有return语句，请问finally里面的代码还会执行吗？
 * 如果会，请问是在return前还是return后？
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
        } finally {
            a = 40;
        }
        return a;
    }
}
