/*
	使用变量的时候要注意的事项：
		A：作用域
			变量定义在哪一级大括号中，哪个大括号的范围就是这个变量的作用域。相同的作用域中不能定义两个同名变量。
		B：初始化
			没有初始化值不能直接使用
		C：在一行上建议只定义一个变量
			可以定义多个，但是不建议
*/
public class DataTypeDemo2{
	public static void main(String[] args){
		//定义变量
		int x = 100;
		//错误，不能有同名的
		//int x = 200;
		
		//定义变量且使用变量前必须给值
		//int y;
		//System.out.println(y);
		
		int z;
		z = 100;
		System.out.println(z);
		
		//在一行上定义多个变量
		//int a = 10;int b= 20;int c = 30;
		//上面的写法可以，但是不建议
		int a = 10;
		int b= 20;
		int c = 30;
		
		//int d,e;
		//d = 40;
		//e = 50;
		
		//int f,int g;//错误
		//int h;int i;//正确
	}
}