/*
	继承的注意事项：
		A：子类只能继承父类所有非私有的成员（成员方法和成员变量）
		B：子类不能继承父类的构造方法，但是可以通过super关键字去访问父类构造方法
		C：不要为了部分功能而去继承
			class A{
				public void show1(){}
				public void show2(){}
			}
			class B{
				public void show2(){}
				public void show3(){}
			}
			//我们发现B类中出现了和A类一样的show2()方法，所以，我们就用继承体现
			class B extends A{
				public void show3(){}
			}
			这样其实不好，因为这样你不但有了show2()方法，还多show1(),有可能这个show1()不是我们想要的。
			
		那么，我们什么适合考虑使用继承呢？
			继承中类之间体现的是：”is a“的关系
				Person
					Student
					Teacher
				水果
					苹果
					香蕉
					橘子
			采用假设法：
				如果有两个类A,B,只有她们符合A是B的一种，或者B是A的一种，就可以考虑继承
*/
class Father{
	private int num = 10;
	public int num2 = 20;
	
	private void method(){
		System.out.println(num);
		System.out.println(num2);
	}
	
	public void show(){
		System.out.println(num);
		System.out.println(num2);
	}
}

class Son extends Father{
	public void function(){
		//System.out.println(num);//num 在 Father 中是 private 访问控制
		System.out.println(num2);
	}
}

public class ExtendsDemo3{
	public static void main(String[] args){
		//创建对象
		Son s = new Son();
		//s.method();//子类不能继承父类的私有方法
		s.show();
		//System.out.println(s.num);//num 在 Father 中是 private 访问控制
		s.function();
	}
}