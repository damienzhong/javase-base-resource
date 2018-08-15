/*
	逻辑运算符：
		&&和&的区别？同理||和|的区别？
			A:最终结果一样
			B：&&具有短路效果。左边是false，右边不执行
				||,左边是true，右边不执行
		
	开发中常用的逻辑运算符：
		&&,||,!
*/
public class OperatorDemo2{
	public static void main(String[] args){
		int a = 3;
		int b = 4;
		int c = 5;
		//&&双与
		System.out.println((a > b) && (a > c));//false & false = false
		System.out.println((a > b) && (a < c));//false & true = false
		System.out.println((a < b) && (a > c));//true & false = false
		System.out.println((a < b) && (a < c));//true & true = true
		System.out.println("----------------------------------------");
		
		int x = 3;
		int y = 4;
		
		//boolean b1 = ((x++ == 3) & (y++ == 4));
		//boolean b1 = ((x++ == 3) && (y++ == 4));
		//boolean b1 = ((++x == 3) & (y++ == 4));
		boolean b1 = ((++x == 3) && (y++ == 4));
		System.out.println("x:" + x);//4
		System.out.println("y:" + y);//4
		System.out.println(b1);//false
	}
}