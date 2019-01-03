/*
	局部内部类：
		A:可以直接访问外部类的成员
		B:在局部位置，可以创建内部类对象，通过对象调用内部类方法，来使用局部内部类功能
		
	局部内部类访问局部变量的注意事项？
		A：局部内部类访问局部变量必须用final修饰
		B：为什么呢？
			局部变量是随着方法的调用而调用，随着调用完毕而消失。
			而对内存的内容并不会立即消失。所以，我们加final修饰。
			加如final修饰后，这个变量就成了常量，既然是常量，你消失了，
			我在内存中存储的是数据20，所以，我还是有数据在使用的。
*/
class Outer{
	private int num = 10;
	
	public void method(){
		int num2 = 20;
		class Inner{
			public void show(){
				System.out.println(num);
				System.out.println(num2);
			}
		}
		
		Inner i = new Inner();
		i.show();
	}
}

public class InnerClassDemo4{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}