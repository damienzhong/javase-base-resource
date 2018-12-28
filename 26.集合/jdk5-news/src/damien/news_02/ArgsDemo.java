package damien.news_02;

/**
 *  可变参数：定义方法的时候不知道定义多少个参数
 *
 *  格式：
 *      修饰符 返回值类型 方法名(数据类型... 变量名){
 *
 *      }
 *
 *      注意：
 *          可变参数的变量实质其实是一个数组
 *          如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
 *
 */
public class ArgsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
        System.out.println(sum(a, b, c, d));
    }

    public static int sum(int b,int c,int... a){
//        System.out.println("a:"+a);
        int sum = 0;
        for(int x : a){
            sum += x;
        }
        return sum;
    }

//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int sum(int a, int b, int c,int d) {
//        return a + b + c + d;
//    }
}
