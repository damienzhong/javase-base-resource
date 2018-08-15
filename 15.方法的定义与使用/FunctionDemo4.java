/*
	题目：我要求数的和
	
	方法的功能相同，参数列表不同的情况，为了见名知意，Java允许他们起一样的名字
	在Java中，这种情况称为：方法重载
	
	方法重载：
		在同一个类中，方法名相同，参数列表不同，与返回值类型无关
		
	参数列表不同：
		A：参数个数不同
		B：参数类型不同
	
*/
public class FunctionDemo4{
	public static void main(String[] args){
		//jvm会根据不同的参数去调用不同的功能
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		
		System.out.println(sum(10.5f,20f));
	}
	
	//求两个数的和
	public static int sum(int a,int b){
		return a+b;
	}
	
	//求三个数的和
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
	
	//求四个数的和
	public static int sum(int a,int b,int c,int d){
		return a+b+c+d;
	}
	
	public static float sum(float a,float b){
		return a+b;
	}
	
}