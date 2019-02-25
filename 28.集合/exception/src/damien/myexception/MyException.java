package damien.myexception;

/**
 * 要想你的类是一个异常类，就必须继承自Exception后者RuntimeExcepti
 *
 * 两种方式：
 *  A：继承Exception
 *  B：继承RuntimeExcepttion
 */
public class MyException extends Exception{

    public MyException(){}

    public MyException(String message){
        super(message);
    }
}
