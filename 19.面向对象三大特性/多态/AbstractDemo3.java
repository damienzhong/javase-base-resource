/*
	一个类如果没有抽象方法，可不可以定义为抽象类？如果可以，有什么意义？
		A:可以
		B:不让创建对象
	
	
	抽象类不能和哪些关键字共存
		private 冲突
		final 冲突
		static 无意义
*/
abstract class Fu{
	//非法的修饰符组合: abstract和private
	//private abstract void show();
	// 非法的修饰符组合: abstract和final
	//final abstract void show();
	//非法的修饰符组合: abstract和static/
	//static abstract void show();
	
	public static void method(){
		System.out.println("method");
	}
}
class Zi extends Fu{
	public void show(){}
}
public class AbstractDemo3{
	public static void main(String[] args){
		Fu.method();
	}
}