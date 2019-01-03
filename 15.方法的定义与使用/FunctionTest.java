/*
	键盘录入两个数据，返回两个数中的较大值
*/
import java.util.Scanner;

public class FunctionTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.print("请输入第二个数据：");
		int b = sc.nextInt();
		
		int result = getMax(a,b);
		System.out.println("最大值是："+result);
	}
	
	/**
		两个明确：
			返回值类型：int
			参数列表：int a,int b
	*/
	public static int getMax(int x,int y){
		//if语句
		/*if(x > y){
			//System.out.println(x);
			return x;
		}else{
			//System.out.println(y);
			return y;
		}
		*/
		//用三元运算符改进
		//int c =((x>y)?x:y);
		//return c;
		return ((x>y)?x:y);
	}
}