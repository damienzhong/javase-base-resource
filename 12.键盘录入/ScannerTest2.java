/*
	键盘录入练习：键盘录入两个数据，获取这两个数据中的最大值
*/
import java.util.Scanner;

public class ScannerTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入第一个数据：");
		int x = sc.nextInt();
		
		System.out.print("请输入第二个数据：");
		int y = sc.nextInt();
		
		int max = (x > y?x: y);
		System.out.println("max:"+ max);
		
		byte b = (byte)300;
		System.out.println(b);
	}
}
/*
键盘录入三个数据，获取这三个数据中的最大值
键盘录入两个数据，比较这两个数据是否相等
*/