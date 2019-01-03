class Code{
	static {
		System.out.println("Code 静态代码块");
	}
	
	{
		System.out.println("Code 构造代码块");
	}
	
	public Code(){
		System.out.println("Code 构造方法");
	}
}

public class CodeTest{
	static {
		System.out.println("code test 静态代码块");
	}
	
	public static void main(String[] args){
		System.out.println("main方法");
		
		Code c1 = new Code();
		Code c2 = new Code();
	}
}