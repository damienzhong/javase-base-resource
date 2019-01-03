/** 刷题软件：牛客网
	键盘录入两个数据，比较两个数是否相等
	
	分析：
		比较两个数是否相等==》结果是一个boolean类型
*/
import java.util.Scanner;

public class FunctionTest02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.print("请输入第二个数据：");
		int b = sc.nextInt();
		
		boolean flag = compare(a,b);
		System.out.println(flag);
	}
	
	/**
		两个明确：
			返回值类型：boolean
			参数列表：int x,int y
	*/
	public static boolean compare(int x,int y){
		//if语句的实现
		/*if(x == y){
			return true;
		}else{
			return false;
		}*/
		//三元运算符改进
		//boolean flag =((x==y)?true:false);
		//return flag;
		//继续改进
		//return ((x==y)?true:false);
		//最终版
		return x == y;
	}
}