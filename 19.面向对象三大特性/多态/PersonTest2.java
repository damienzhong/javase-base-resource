/*
	形式参数：
		基本类型：（太简单了，今天就不讲了）
		引用类型：
			类名：（匿名对象的时候我们已经讲过了）需要的是该类的对象
			抽象类：需要的是该抽象类的子类对象
			接口：需要的是该接口的实现类对象
*/
interface Smoking{
	public abstract void smok();
}

class SmokDemo{
	public void method(Smoking s){
		s.smok();
	}
}

class Person implements Smoking{
	public void smok(){
		System.out.println("小孩子别抽烟！");
	}
}

public class PersonTest2{
	public static void main(String[] args){
		SmokDemo sd = new SmokDemo();
		Smoking s = new Person();
		sd.method(s);
	}
}