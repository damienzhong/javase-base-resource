/*
	类与类：
		继承关系，只能单继承，可以多层继承
	类与接口：
		实现关系,可以单实现，也可以多实现
	接口与接口：
		继承关系，可以单继承，也可以实现多继承,可以多层继承
*/
interface Father{
	public abstract void show();
}

interface Mother extends NaiNai{
	public abstract void show2();
}

interface NaiNai{
	public abstract void show3();
}

interface Sister extends Father,Mother{
	
}

class Son implements Father,Mother{
	public void show(){
		System.out.println("show Son");
	}
	public void show2(){
		System.out.println("show2 Son");
	}
	public void show3(){
		System.out.println("show3 Son");
	}
}

public class InterfaceDemo3{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
		s.show2();
		s.show3();
	}
}