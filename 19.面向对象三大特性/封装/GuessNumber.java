/*
	猜数字小游戏（数据在1-100之间）
	
	分析：
		A：程序产生一个随机数。（被猜的）
		B：键盘录入数据。（你猜的）
		C：把你猜的和被猜的进行比较
			a：大了
			b：小了
			c：猜中了
		D：给出多次猜的机会，猜中就结束
			
*/
import java.util.Scanner;
public class GuessNumber{
	public static void main(String[] args){
		//程序产生一个随机数。（被猜的）
		int number = (int)(Math.random()*100)+1;
		
		//给出多次猜的机会，猜中就结束
		while(true){
			//键盘录入数据。（你猜的）
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入您要猜的数据（1-100）：");
			int guessNumber = sc.nextInt();
			
			//把你猜的和被猜的进行比较
			if(guessNumber > number){
				System.out.println("你猜的数据"+guessNumber+"大了");
			}else if(guessNumber < number){
				System.out.println("你猜的数据"+guessNumber+"小了");
			}else{
				System.out.println("恭喜你，猜中了，五百万带回家！！！");
				break;
			}
		}
	}
}
