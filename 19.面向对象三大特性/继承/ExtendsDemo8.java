/*
	继承中的成员方法的关系：
		A:子类中的方法和父类中的方法声明不一样，子类直接调用该方法名的方法
		B:子类中的方法和父类中的方法声明一样，该怎么玩？
			通过子类调用方法：
				a:先找子类中，有没有这个方法，有就使用
				b:再看父类中，有没有这个方法，有就使用
				c:如果还没有，就报错
*/
class Father{
	public void show(){
		System.out.println("show Father");
	}
}

class Son extends Father{
	public void method(){
		System.out.println("method Son");
	}
	
	public void show(){
		System.out.println("show Son");
	}
}

public class ExtendsDemo8{
	public static void main(String[] args){
		//创建对象
		Son s = new Son();
		s.show();
		s.method();
		s.function();
	}
}