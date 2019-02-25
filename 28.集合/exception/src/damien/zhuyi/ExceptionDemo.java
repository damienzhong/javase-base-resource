package damien.zhuyi;

import javax.management.BadAttributeValueExpException;
import java.lang.instrument.IllegalClassFormatException;
import java.security.acl.AclNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 异常注意事项：
 * 1、子类覆盖父类方法时，子类的方法必须抛出相同的异常或父类异常的子类。（父亲坏了，儿子不能比父亲更坏）
 * 2、如果父类抛出了多个异常，子类覆盖父类时，只能抛出相同的异常或者是它的子集，子类不能抛出父类没有的异常
 * 3、如果被覆盖的方法没有异常抛出，那么子类的方法绝对不能抛出异常，如果子类方法内有异常，那么子类只能try，不能throws
 */
public class ExceptionDemo {
    public static void main(String[] args) {

    }
}

class Fu{
    public void method(){}
}

class Zi extends Fu{
    @Override
    public void method() {
        String s = "2019-02-25";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("");
        try {
            simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
