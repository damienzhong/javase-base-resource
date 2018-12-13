package damien.demo02;

/**
 * @author damienzhong
 * 字符串常量：一旦被赋值就不能够被改变，值不能变
 *
 * 字符串直接赋值的方式是先到字符串常量池里面去找，如果由就直接返回，没有，就创建并返回
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = "hello";
        s += "world";
        System.out.println("s:" + s);//helloworld
    }
}
