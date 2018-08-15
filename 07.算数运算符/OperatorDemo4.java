/*
	赋值运算符：
		基本赋值运算符：=
			把=右边的数据赋值给左边。
		扩展的赋值运算符：+=，-=，/=，%=
*/
public class OperatorDemo4{
	public static void main(String[] args){
		//定义一个变量
		int x = 10;
		
		//其他用法
		int a,b;
		a = b = 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println("-------------------------------");
		
		//定义一个变量
		int y = 10;
		
		y += 10;//理解为y = y + 10;
		
		System.out.println(y);
	}
}