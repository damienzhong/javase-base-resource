/*
	继承概述：
		把多个类中相同的内容给提取出来定义到一个类中。
		
	如何实现继承？
		Java提供了关键字：extends
		
	格式：
		class 子类名 extends 父类名{}
		
	好处：
		A：提供了代码的复用性
		B：提供了代码的维护性
		C：让类与类之间产生关系，是多态的前提
		
*/
//继承前
/*class Student{
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void sleep(){
		System.out.println("睡觉");
	}
}

class Teacher{
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void sleep(){
		System.out.println("睡觉");
	}
}*/
//使用继承后
class Person{
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void sleep(){
		System.out.println("睡觉");
	}
}

class Student extends Person{}

class Teacher extends Person{}

public class ExtendsDemo{
	public static void main(String[] args){
		Student s = new Student();
		s.eat();
		s.sleep();
		System.out.println("-------------");
		
		Teacher t = new Teacher();
		t.eat();
		t.sleep();
	}
}