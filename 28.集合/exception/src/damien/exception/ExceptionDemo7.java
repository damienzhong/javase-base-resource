package damien.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * throws:
 * 定义功能方法时，需要把出现的问题暴露出来，让调用者去处理。
 * 那么就通过throws在方法上标识。
 */
public class ExceptionDemo7 {
    public static void main(String[] args) {
//        try{
//            method();
//        }catch (ParseException e){
//            e.printStackTrace();
//        }
//        try {
//            method2();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        method3();
        System.out.println("方法调用完成");
    }

    //运行时期异常
    public static void method3() throws ArithmeticException{
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    //编译时期异常
    public static void method() throws ParseException {
        String s = "2019/02/13";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(s);
        System.out.println(date);
    }

    public static void method2() throws ParseException {
        method();
    }
}
