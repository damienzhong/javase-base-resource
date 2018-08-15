/*
	在控制台输出一个四行五列的*图案
		*****
		*****
		*****
		*****
	总结：内层循环控制列数，外层循环控制行数
*/
import java.util.Scanner;
public class ForForTest{
	public static void main(String[] args){
		//最傻最傻的办法，不合适
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("------------------------");
		//单for循环，不合适
		for(int i = 0;i<4;i++){
			System.out.println("*****");
		}
		System.out.println("------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要输出的列数：");
		int n = sc.nextInt();
		System.out.println("请输入要输出的行数：");
		int m = sc.nextInt();
		//控制行数
		for(int j = 0;j<m;j++){
			//控制每行的列数
			for(int i=0;i<n;i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}