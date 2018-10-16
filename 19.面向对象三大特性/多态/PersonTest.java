/*
	形式参数：
		基本类型：（太简单了，今天就不讲了）
		引用类型：
			类名：（匿名对象的时候我们已经讲过了）需要的是该类的对象
			抽象类：需要的是该抽象类的子类对象
			接口：
		
*/
abstract class Person{
	public abstract void study();
}

class PersonDemo{
	public void method(Person p){
		p.study();
	}
}

//定一个学生类
class Student extends Person{
	public void study(){
		System.out.println("好好学习");
	}
}

public class PersonTest{
	public static void main(String[] args){
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
		
	}
}
