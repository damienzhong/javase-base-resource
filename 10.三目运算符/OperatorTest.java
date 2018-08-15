/*
	练习：
		获取两个整数中的最大值
		获取三个整数中的最大值
		比较两个整数是否相同
*/
public class OperatorTest {
	public static void main(String[] args) {
		//获取两个整数中的最大值
		int x = 100;
		int y = 200;
		
		int max = (x > y? x: y);
		System.out.println(max);
		System.out.println("--------------------");
		
		//获取三个整数中的最大值
		int a = 10;
		int b = 30;
		int c = 20;
		
		//分两步
		//A：先比较a,b的最大值
		//B:拿a,b的最大值再和c进行比较
		int temp = ((a > b)? a: b);
		//System.out.println(temp);
		int max1 = ((temp > c)?temp: c);
		System.out.println("max1:"+max1);
		
		//一步搞定
		//int max2 = (a > b)?((a > c)?a: c):((b > c)? b: c);
		int max2 = a > b?a > c?a: c:b > c? b: c;
		System.out.println("max2:"+max2);
		
		//比较两个整数是否相同
		int m = 100;
		int n = 200;
		//boolean flag = (m == n)?true:false;
		boolean flag = (m == n);
		System.out.println("flag:"+flag);
	}
}