/*
	匿名内部类：
		就是内部类的简化写法。
		
	前提：存在一个类或者接口
		这里的类可以是具体的类也可以是抽象类。
		
	格式：
		new 类名或者接口名(){
			重写方法;
		}
		
	本质是什么呢？
		是一个继承了该类或者实现了该接口的子类匿名对象
*/
interface Inter{
	public abstract void show();
	public abstract void show2();
}

class Outer{
	public void method(){
		//一个方法的时候
		/*new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show()2{
				System.out.println("show");
			}
		}.show();
		*/
		//两个方法的时候
		/*new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show");
			}
		}.show();
		new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show");
			}
		}.show2();
		*/
		//如果接口或类有很多个方法，就很麻烦
		//那么，如何改进呢？
		Inter i = new Inter(){//多态
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show");
			}
		};
		i.show();
		i.show2();
	}
}

public class InnerClassDemo5{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}