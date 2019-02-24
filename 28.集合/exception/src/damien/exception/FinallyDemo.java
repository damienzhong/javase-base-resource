package damien.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * finally:被finally控制的语句一定会执行
 *  注意：如果执行到finally之前jvm退出了，就不能执行了
 *
 * try...catch...finally处理格式：
 * try{
 * 可能出现问题的代码
 * }catch(异常名 变量){
 * 针对问题的处理
 * }finally{
 * 释放资源
 * }
 *
 * 作用：用于释放资源，再后面的IO流与数据库的学习中会见到
 */
public class FinallyDemo {
    public static void main(String[] args) {
        String s = "2019/02/24";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH");

        Date d = null;
        try {
            //System.out.println(10/0);
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            System.exit(0);
        }finally {
            System.out.println("finally的代码执行拉~");
        }

        System.out.println(d);
    }
}
