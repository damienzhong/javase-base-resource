package damien.exception;

/**
 * 异常：程序出现了不正常的情况。
 *
 *  程序的异常：Throwable
 *      严重问题：Error，我们不处理，这种问题一般都是很严重的，比如说内存溢出
 *      问题：Exception
 *          运行期间的问题：RuntimeException，这种问题我们也不处理，因为是写代码的人的问题，出现这个问题是因为代码不够严谨，需要修正代码。
 *          编译期间的问题：不是RuntimeException的异常 。这种问题我们必须处理。因为你不处理，编译就不能通过。
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int a;
    }
}
