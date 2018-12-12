package damien.day02;

/**
 * 看程序写结果
 *  Integer的数据直接赋值，如果在-128到127之间，会直接从数据缓冲池里获取数据
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//false
        System.out.println(i1.equals(i2));//true
        System.out.println("------------------");

        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);//false
        System.out.println(i3.equals(i4));//true
        System.out.println("------------------");

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);//false
        System.out.println(i5.equals(i6));//true
        System.out.println("------------------");

        Integer i7 = 127;
        Integer i8 = 127;
        System.out.println(i7 == i8);//true
        System.out.println(i7.equals(i8));//true

        //通过查询源码，我们可以知道，针对-128到127之间的数据，做了一个数据缓冲池，如果数是该范围内的，每次并不创建新的空间
        //Integer integer = Integer.valueOf(127);
    }
}
