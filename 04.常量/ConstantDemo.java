/**
*	常量：在程序执行过程中，其值不会发生改变的量
*	分类：①字面值常量
*		  ②自定义常量
*	字面值常量：
*		1、字符串常量：	用双引号括起来的内容
*			举例："hello","damienzhong.com"
*		2、整数常量：	所有整数
*			举例：1，100，1000
*		3、小数常量：	所有小数
*			举例：1.1，5.20
*		4、字符常量：	用单引号括起来的内容
*			举例：'a','B','0'
*		5、布尔常量：	比较特殊，表示真假
*			举例：true、false
*		6、空常量：	空
*			举例：null
*/
public class ConstantDemo{
		//字符串常量的输出
	public static void main(String[] args){
		System.out.println("0");
		//整数常量的输出
		System.out.println(0);
		//小数常量的输出
		System.out.println(1.85);
		//字符常量的输出
		System.out.println('0');
		System.out.println('B');
		//是有问题的
		//System.out.println('AB');
		//布尔常量的输出
		System.out.println(true);
		System.out.println(false);
	}
}