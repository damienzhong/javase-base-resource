/*
	do…while循环语句格式

			基本格式
			   do {
					 循环体语句;
			   }while((判断条件语句);
			扩展格式
			   初始化语句;
			   do {
					 循环体语句;
					 控制条件语句;
				} while((判断条件语句);

*/
public class DoWhileDemo{
	public static void main(String[] args){
		//输出10次呆萌钟的淘宝男装店名
		int x = 0;
		do{
			System.out.println("呆萌钟的淘宝男装店名:DM潮人社区");
			x++;
		}while(x<10);
		System.out.println("================");
		//求和1-100
		int sum = 0;
		int a =1;
		do{
			sum+=a;
			a++;
		}while(a<=100);
		System.out.println(sum);
	}
}