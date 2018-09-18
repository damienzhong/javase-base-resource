/*
	问题：
		我不仅仅要输出局部范围的num，还要输出本类成员范围的num，怎么办？
		我还想要输出父类成员范围的num，怎么办？
			Java为我们提供了一个与this类似的关键字：super
			它可以直接访问父类的数据。
			
		this和super的区别？
			分别是什么？
				this代表本类对应的引用
				super代表父类存储空间的标识（可以理解为父类引用，可以操作父类成员）
			怎么用呢？
				A：调用成员变量
					this.成员变量 调用的是本来的成员变量
					super.成员变量 调用父类的成员变量
				B：调用构造方法	
					this(...)	调用本类的构造方法
					super(...)	调用父类的构造方法
				C：调用成员
					this.成员方法 	调用的是本类的成员方法
					super.成员方法	调用的是父类的成员方法
				
*/
class Father{
	public int num = 10;	
}

class Son extends Father{
	public int num = 30;
	public void show(){
		int num = 40;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

public class ExtendsDemo5{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
	}
}