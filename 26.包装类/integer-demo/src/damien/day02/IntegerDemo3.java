package damien.day02;

/**
 * JDK5的新特性
 * 自动装箱：把基本数据类型转换为包装类类型
 * 自动拆箱：把包装类类型转换为基本数据类型
 * 注意：
 * 再使用时，Integer x = null;代码会出现NullPointerException。
 * 建议先判断是否为null,然后再使用
 */
public class IntegerDemo3 {
    public static void main(String[] args) {
        //定义一个int类型的包装类类型变量
        Integer i = new Integer(100);

        Integer i2 = 100;
        i2 += 200;
        System.out.println(i2);

//        Integer i = new Integer(100);
//        Integer i2 = Integer.valueOf(100);//自动装箱
//        i2 = Integer.valueOf(i2.intValue() + 200);//先自动拆箱，再自动装箱
//        System.out.println(i2);

        Integer i3 = null;
        if (i3 != null) {
            //NullPointerException
            i3 += 100;
            System.out.println(i3);
        }
    }
}
