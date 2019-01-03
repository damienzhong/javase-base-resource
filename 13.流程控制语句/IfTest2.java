/*
	店铺名：DAMIEN工作室
	题目：
		键盘录入月份值，输出对应的季节
		
		春：3，4，5
		夏：6，7，8
		秋：9，10，11
		冬：12，1，2
*/
import java.util.Scanner;

public class IfTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个月份：");
		int month = sc.nextInt();
		
		/*if(month<1 || month>12){
			System.out.println("您输入的月份有误！");
		}else if(month == 1){
			System.out.println("冬天");
		}else if(month == 2){
			System.out.println("冬天");
		}else if(month == 3){
			System.out.println("春天");
		}else if(month == 4){
			System.out.println("春天");
		}else if(month == 5){
			System.out.println("春天");
		}else if(month == 6){
			System.out.println("夏天");
		}else if(month == 7){
			System.out.println("夏天");
		}else if(month == 8){
			System.out.println("夏天");
		}else if(month == 9){
			System.out.println("秋天");
		}else if(month == 10){
			System.out.println("秋天");
		}else if(month == 11){
			System.out.println("秋天");
		}else if(month == 12){
			System.out.println("冬天");
		}
		*/
		System.out.println("====================================");
		if(month<1 || month>12){
			System.out.println("您输入的月份有误！");
		}else if(month>=3 && month<=5){
			System.out.println("春天");
		}else if(month>=6 && month<=8){
			System.out.println("夏天");
		}else if(month>=9 && month<=11){
			System.out.println("秋天");
		}else {
			System.out.println("冬天");
		}
	}
}