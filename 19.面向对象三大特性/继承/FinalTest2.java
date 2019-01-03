/*
	final修饰变量的初始化时机
		A:被final修饰的变量只能赋值一次。
		B:在构造方法完毕前（非静态变量）
*/
class Demo{
	int num = 10;
	final int num2;
	//final int num2 = 20;
	
	{
		num2 = 10;
	}
	public Demo(){
		num = 100;
		num2 = 200;
	}
}

public class FinalTest2{
	public static void main(String[] args){
		Demo d = new Demo();
		System.out.println(d.num);
		System.out.println(d.num2);
	}
}