/*
	思考题1：请问下面这个有没有问题
		double d = 12.345;
		float f = d;
		
	思考题2：看看下面两个定义有没有区别呢？
		float f1 = (float)12.345;
		float f2 = 12.345F;
*/
public class DataTypeDemo5{
	
	public static void main(String[] args){
		//把double赋值给float，加了强制类型转换
		double d = 12.345;
		float f = (float)d;
		//看看下面两个定义有没有区别呢？
		float f1 = (float)12.345;
		float f2 = 12.345F;
		System.out.println(f1);
		System.out.println(f2);
	}
}