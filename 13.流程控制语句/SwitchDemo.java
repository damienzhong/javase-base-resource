/*
	淘宝店铺：DM潮人社区
	
	Switch注意事项：
		1、case后面只是能是常量，不能是变量，而且，多个case后面的值不能出现相同的
		2、default可以省略吗？
			可以省略。一般不建议。除非判断的值是固定的。（单选题）
		3、break可以省略吗？
			可以省略，一般不建议。否则结果可能不是你想要的。
		4、default的位置一定要在最后面吗？
			不是，可以在任意位置。但是建议在最后。
		5、switch语句的结束条件
			a:遇到break就结束
			b:执行到末尾就结束了
*/

import java.util.Scanner;

public class SwitchDemo{
	public static void main(String[] args){
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//控制键盘录入的数据
		System.out.println("请输入一个数据（1-7）：");
		int week = sc.nextInt();
		
		//int number = 1;
				
		switch(week) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期七");
				break;
			default:
				System.out.println("你输入的数据有误");
				break;
		}
		
	}
}