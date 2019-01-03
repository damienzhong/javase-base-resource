/*
	淘宝店铺名：DM潮人社区
	
	输出10次I love you!
	循环语句：for循环、while循环、do..while循环
	
	for循环格式：
		for(初始化语句;判断条件语句;控制条件语句){
			循环体语句;
		}

	注意事项：
	1、判断条件语句的结果是一个boolean类型
	2、循环体语句如果是一条语句，大括号可以省略；如果是多条语句，大括号不能省略.建议永远都不要省略
	3、
		
*/
public class ForDemo{
	public static void main(String[] args){
		/*System.out.println("I love you!");
		System.out.println("I love you!");
		System.out.println("I love you!");
		System.out.println("I love you!");
		System.out.println("I love you!");
		System.out.println("I love you!");
		System.out.println("I love you!");
		System.out.println("I love you!");
		System.out.println("I love you!");
		System.out.println("I love you!");*/
		
		System.out.println("====================");
		
		for(int i = 1;i<=100;i++){
			System.out.println("I love you!");
			System.out.println("淘宝店铺名：DM潮人社区");
		}
		
		
	}
}