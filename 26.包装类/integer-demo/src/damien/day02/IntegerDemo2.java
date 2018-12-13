package damien.day02;

/**
 *  int类型和String类型的相互转换
 *      int --> String
 *              String.valueOf(num);
 *      String --> int
 *              Integer.parseInt(s);
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        //int --> String
        int num = 100;
        //方式1
        String s1 = "" + num;
        System.out.println(s1);
        System.out.println("-----------------");
        //方式2
        String s2 = String.valueOf(num);
        System.out.println(s2);
        System.out.println("-----------------");
        //方式3
        Integer i = new Integer(num);
        String s3 = i.toString();
        System.out.println(s3);
        System.out.println("-----------------");
        //方式4
        String s4 = Integer.toString(num);
        System.out.println(s4);
        System.out.println("-----------------");

        //String --> int
        String s = "100";
        //方式1
        Integer i2 = new Integer(s);
        int x = i2.intValue();
        System.out.println(x);
        System.out.println("-----------------");
        //方式2
        int y = Integer.parseInt(s);
        System.out.println(y);
        System.out.println("-----------------");
    }
}
