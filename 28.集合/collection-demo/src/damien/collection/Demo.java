import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100);
        Scanner s = new Scanner(System.in);
        System.out.println("欢迎来到猜数字游戏，接下来你能输入一个1-100的数字，再根据提示再进行输入，直到猜中!");
        int i, j;
        j = s.nextInt();
        for (i = 1; j != a; i++) {
            System.out.println("第"＋i + "次输入!");
            if (j > a) {
                System.out.println("太大了!");
            }
            ;
            if (j < a)
                System.out.println("太小了!");
        } ;
        j = s.nextInt();

    }
    System.out.println("终于对了!");
}