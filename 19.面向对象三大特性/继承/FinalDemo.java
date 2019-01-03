/*
	fianl可以修饰类、方法、变量
	
	特点：
		final可以修饰类，该类不能被继承。
		final可以修饰方法，该类不能被重写（覆盖）
		final可以修饰变量，该变量不能被重新赋值，因为这个变量其实是常量。
		
	常量：
		A：字面值常量
			"hello",10,true
		B：自定义常量
			final int x = 10;
*/
//final class Fu	//无法从最终Fu进行继承
class Fu{
	public int num = 10;
	public final int num2 = 20;
	/*public final void show(){
		
	}*/
}

class Zi extends Fu{
	public void show(){
		num = 100;
		System.out.println(num);
		
		num2 = 200;//无法为最终变量num2分配值
		System.out.println(num2);
	}
}

public class FinalDemo{
	public static void main(String[] args){
		Zi z = new Zi();
		z.show();
	}
}