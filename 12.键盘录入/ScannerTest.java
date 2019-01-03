/*
	键盘录入练习：
		键盘录入两个数据，并对这两个数据求和，输出其结果
*/
import java.util.Scanner;

public class ScannerTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入第一个数据：");
		int x = sc.nextInt();
		
		System.out.print("请输入第二个数据：");
		int y = sc.nextInt();
		
		int sum = x + y;
		System.out.println("sum:"+sum);
	}
}