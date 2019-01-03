/*
	++,--运算符的使用：
		单独使用：放在操作数的前面和后面效果是一样的。（这种用法是我们比较常见的）
		参与运算使用：
			放在操作数的前面，先自增或自减，然后再参与运算
			放在操作数的后面，先参与运算，再自增或者自减。
	
*/
public class OperatorDemo2{
	public static void main(String[] args){
		int x = 3;
		int y = 4;
		
		//字符串的拼接
		//System.out.println("x:" + x);
		//System.out.println("y:" + y);
		
		System.out.println("x:" + x + ",y:" + y);
		
		//单独使用
		//x++;
		//y--;
		++x;
		--y;
		//System.out.println(x);
		System.out.println("x:" + x + ",y:" + y);
		//意外的类型，常量的不可以这样做的
		//System.out.println(10++);
		
		System.out.println("==========================");
		//参与运算使用
		int a = 3;
		int b = 4;
		
		//int c = a++;
		//int d = b--;
		
		int c = ++a;
		int d = --b;
		
		System.out.println("a:" + a);//4	4
		System.out.println("b:" + b);//3	3
		System.out.println("c:" + c);//3	4
		System.out.println("d:" + d);//4	3
	}
}