package damien.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 编译时异常和运行时异常的区别：
 * 编译期异常：Java程序必须显示处理，佛则程序就会发生错误，无法通过编译
 * 运行期异常：无需显式处理，也可以和编译时异常一样处理
 */
public class ExceptionDemo5 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        try {
//            System.out.println(a / b);
//        }catch (ArithmeticException e){
//            System.out.println("/ by zero");
//        }

        String s = "2019/02/13";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            //e.printStackTrace();
            System.out.println("解析日期出问题了");
        }
    }
}
