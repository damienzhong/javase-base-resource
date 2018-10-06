/*
	多态的弊端：
		不能使用子类特有功能。
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
		f.show();
		f.method();
	}
}