/*
	题目：在控制台输出如下的形状
			*****
			*****
			*****
			*****
			
		 void类型返回值的方法调用：
			单独调用(可以)
			输出调用(不行)
			赋值调用(不行)
*/
public class FunctionDemo3{
	public static void main(String[] args){
		//for循环嵌套输出图形
		for(int x = 0;x<4;x++){
			for(int y=0;y<5;y++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		//六行七列
		for(int x = 0;x<6;x++){
			for(int y=0;y<7;y++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		//单独调用
		printStars(3,4);
		//输出调用
		//System.out.println(printStars(3,4));
		//void v = printStars(3,4);
	}
	
	/*
		写一个什么样子的方法？写一个m行n列的代码
		
		两个明确：
			返回值类型：这个时候没有明确的返回值，不写东西还不行。所以，这里选择用void
			参数列表：int m,int n
	*/
	public static void printStars(int m,int n){
		for(int x = 0;x<m;x++){
			for(int y=0;y<n;y++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}