/*
	类的组成：
		成员变量
		构造方法
		成员方法
	现在我们又讲了继承，所以，我们就应该考虑一下，类的组成部分的各自关系
	
	继承中的成员变量的关系：
		A:子类中的成员变量和父类中的成员变量名称不一样
		B:子类中的成员变量和父类中的成员变量名称一样
			在子类中访问一个变量的查找顺序：
				a：在子类方法的局部范围找，有就使用
				b：在子类的成员范围找，有就使用
				c：在父类的成员范围找，有就使用
				d：如果还找不到，会报错
				
*/
class Father{
	public int num = 10;
	
	public void method(){
		int num = 50;
	}
}

class Son extends Father{
	public int num2 = 20;
	public int num = 30;
	public void show(){
		int num = 40;
		System.out.println(num);
		System.out.println(num2);
		//System.out.println(num3);//找不到符号
	}
}

public class ExtendsDemo4{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
	}
}