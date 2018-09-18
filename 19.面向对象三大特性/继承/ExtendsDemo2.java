/*
	java中继承的特点：
		A：java中只支持单继承，不支持多继承
			有些语言是支持多继承的，格式：extends 类1,类2,...
		B：java支持多层继承（继承体系）
*/
/*
class Father{}
class Mother{}
class Son extends Father,Mother{}
*/
class GrandFather{
	public void show(){
		System.out.println("我是你爷爷");
	}
}
class Father extends GrandFather{
	public void method(){
		System.out.println("我是你爸爸");
	}
}

class Son extends Father{}

public class ExtendsDemo2{
	public static void main(String[] args){
		Son s = new Son();
		s.method();
		Father f = new Father();
		f.show();
		s.show();
	}
}