/*
	方法重写的注意事项：
		A：父类中私有方法不能被重写
			因为父类私有方法子类根本就无法继承
		B：子类重写父类方法时，访问权限不能更低
			最好就一致
		C：父类静态方法，子类也必须通过静态方法进行重写
			其实这个算不算方法重写，但是现象确实如此。
			
		子类重写父类方法的时候，最好声明一模一样。
*/
class Father{
	public static void show(){
		System.out.println("show Father");
	}
}

class Son extends Father{
	public static void show(){
		System.out.println("show Son");
	}
}

public class ExtendsDemo10{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
	}
}