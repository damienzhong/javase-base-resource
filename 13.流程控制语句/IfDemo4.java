/*
if语句第三种格式：
	if(关系表达式1) {
		     语句体1;
	}else  if (关系表达式2) {
		     语句体2;
	}
    …
	else {
		     语句体n+1;
	}
	
	执行流程：
		首先判断关系表达式1看其结果是true还是false
		如果是true就执行语句体1
		如果是false就继续判断关系表达式2看其结果是true还是false
		如果是true就执行语句体2
		如果是false就继续判断关系表达式…看其结果是true还是false
		…
		如果没有任何关系表达式为true，就执行语句体n+1。
*/
import java.util.Scanner;

public class IfDemo4{
	public static void main(String[] args){
		//需求：键盘录入一个成绩，判断并输出成绩的等级。
		/*
			90-100 优秀
			80-90  好
			70-80  良
			60-70  及格
			0-60   不及格
		*/
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//录入数据
		System.out.println("请输入您的考试成绩：");
		int score = sc.nextInt();
		if(score>100 || score<0){
			System.out.println("您输入的成绩有误！");
		}else if(score>=90 && score<=100){
			System.out.println("优秀");
		}else if(score>=80 && score<=90){
			System.out.println("好");
		}else if(score>=70 && score<=80){
			System.out.println("良");
		}else if(score>=60 && score<=70){
			System.out.println("及格");
		}else if(score>=0 && score<=60){
			System.out.println("不及格");
		}
	}
}