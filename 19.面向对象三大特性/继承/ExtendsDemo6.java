/*
	继承中构造方法的关系：
		A：子类中所有的构造方法默认都会访问父类中空参的构造方法
		B：为什么呢？
			因为子类会继承父类中的数据，可能还会使用父类的数据，
			所以，子类初始化前，一定要先完成父类数据的初始化。
			
		注意：子类每一个构造方法的第一条语句默认都是：super()	
*/
class Father{
	int age;
	
	public Father(){
		System.out.println("Father的无参构造方法");
	}
	
	public Father(int age){
		System.out.println("Father的有参构造方法");
	}
}

class Son extends Father{
	public Son(){
		//super();
		System.out.println("Son的无参构造方法");
	}
	
	public Son(int age){
		//super();
		System.out.println("Son的有参构造方法");
	}
}

public class ExtendsDemo6{
	public static void main(String[] args){
		Son s = new Son();
		System.out.println("--------------------------------");
		Son s1 = new Son(20);
	}
}