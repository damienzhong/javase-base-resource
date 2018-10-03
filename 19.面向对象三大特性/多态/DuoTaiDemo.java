/*
	多态：同一个对象（事物），在不同时刻体现出来的不同状态。
	举例：
		猫是猫，猫是动物
		水（液体、固体、气体）
		
		猫 m = new 猫();
		动物 d = new 猫();
		
	多态的前提：
		A：要有继承关系
		B：要有方法重写
			其实没有方法重写也是可以的，但是如果没用这个就没有意义
		C：要有父类引用指向子类对象
			父 f = new 子();
			
		用代码体现一下多态
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
}

public class DuoTaiDemo{
	public static void main(){
		//要有父类引用指向子类对象
		//父 f = new 子();
		Fu f = new Zi();
	}
}