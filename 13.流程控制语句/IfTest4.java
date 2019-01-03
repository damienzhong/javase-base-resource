/*
	if else与三元运算符的区别：
		三元运算符可以实现的，if else都可以实现，反过来就不行
		什么时候if实现的三元实现不了？
			当if语句控制的是一个输出语句的时候就不能。
			为什么呢？
				因为三元运算符是一个运算符，运算符操作完成之后肯定会得到一个结果，而不是一个输出
*/
public class IfTest4{	
	public static void main(String[] args){
		//获取两个数据的最大值
		int a = 10;
		int b = 20;
		
		//用if语句实现
		int max1;
		if(a > b){
			max1 = a;
		}else {
			max1 = b;
		}
		
		System.out.println("max1:"+max1);
		
		//用三元改进
		int max2 = (a > b)? a:b;
		System.out.println("max2:"+max2);
		
		//判断一个数据是奇数还是偶数，并输出是奇数还是偶数
		int x = 100;
		
		if(x%2 == 0){
			System.out.println("x是偶数");
		}else {
			System.out.println("x是奇数");
		}
		
		//x%2 == 0?System.out.println("x是偶数"):System.out.println("x是奇数");
	}
}