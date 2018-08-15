/*
	+的用法：
		A:加法
		B:正号
		C:字符串连接符
*/
public class OperatorDemo3{
	public static void main(String[] args){
		//加法
		System.out.println(3 + 4);
		
		//正号
		System.out.println(+4);
		
		System.out.println('a');
		System.out.println('a' + 1);//这里是加法
		
		//字符串连接符
		System.out.println("hello" + 'a' + 1);//helloa1
		System.out.println('a' + 1 +"hello");//98hello
	}
}