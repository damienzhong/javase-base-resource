package damien.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Throwable的常用方法：
 * public String getMessage():返回该错误的详细信息的字符串。
 * public String toString():返回一个对这个异常的简短描述
 * public void printStackTrace():获取异常类名和异常信息，以及异常出现在程序中的位置，返回void，把信息输出在控制台
 *
 */
public class ExceptionDemo6 {
    public static void main(String[] args) {

        String s = "2019/02/13";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse(s);//创建了一个ParseException对象，然后抛出去，和catch里面进行匹配
            System.out.println(date);
        } catch (ParseException e) {//ParseException e = new ParseException();
            e.printStackTrace();

//            String message = e.getMessage();
//            System.out.println(message);
//
//            System.out.println(e.toString());
        }
    }
}
