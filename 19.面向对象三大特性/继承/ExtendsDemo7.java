/*
	如果父类没有无参构造方法，那么子类的构造方法会报错
	如何解决？
		A:在父类中添加一个无参构造方法
		B:通过使用super关键字去显示的调用父类的带参构造方法
		C:子类通过this去调用本类的其他构造方法
			子类中一定要有一个去访问了父类的构造方法，否则父类数据就没有初始化。
			
		注意事项：
			this(...)或者super(...)必须出现在第一条语句上。
			如果不说放在第一条语句上，就可能对父类数据进行了多次初始化，所以必须放在第一条语句。
		
*/
class Father{
	
	/*public Father(){
		System.out.println("Father的无参构造方法");
	}*/
	
	public Father(String name){
		System.out.println("Father的带参构造方法");
	}
}

class Son extends Father{
	public Son(){
		super("呆萌钟");
		System.out.println("Son的无参构造方法");
	}
	
	public Son(String name){
		this();
		System.out.println("Son的无参构造方法");
	}
}

public class ExtendsDemo7{
	public static void main(String[] args){
		Son s = new Son();
		Son s1 = new Son("呆萌钟");
	}
}