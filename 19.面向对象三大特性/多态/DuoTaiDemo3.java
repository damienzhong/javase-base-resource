/*
	多态的弊端：
		不能使用子类特有功能。
		
	我就想使用子类的特有功能？行不行？
		行
	怎么用呢？
		A：创建子类对象调用方法。（可以，但是很多时候不合理，而且，太占用内存）
		B：把父类的引用强制转化为子类的引用。（向下转型）
		
	对象间的转型问题：
		向上转型：
			Fu f = new Zi();
		向下转型：
			Zi z = (Zi)f;//要求该f必须是能够转换为Zi
*/
class Fu{
	public void show(){
		System.out.println("show Fu");
	}
}

class Zi extends Fu{
	public void show(){
		System.out.println("show Zi");
	}
	
	public void method(){
		System.out.println("method Zi");
	}
}

public class DuoTaiDemo3{
	public static void main(String[] args){
		Fu f = new Zi();
		//f.show();
		//f.method();
		//创建子类对象
		//Zi zi = new Zi();
		//zi.show();
		//zi.method();
		//把子的对象赋值给父亲，但是因为父的引用类型与子的不一致，所以我们需要做个强制类型转化
		Zi z = (Zi)f;
		z.show();
		z.method();
	}
}