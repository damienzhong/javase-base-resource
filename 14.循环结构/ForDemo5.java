/*
	需求：在控制台输出所有的”水仙花数”
	水仙花数：就是指一个三位数，其各位数的立方和等于该数本身。
	举例：153就是一个水仙花数
	153 = 1*1*1+5*5*5+3*3*3=1+125+27=153
	
	A：三位数其实是告诉我们范围
	B：我们如何获取一个数据的个、十、百呢？
		假设数据：153
		ge:153%10=3
		shi:153/10%10=5
		bai:153/10/10%10=1
		qian:...
*/
public class ForDemo5{
	public static void main(String[] args){
		for(int x=100;x<1000;x++){
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			//如果相同，就把该数据在控制台输出
			if(x == ge*ge*ge+shi*shi*shi+bai*bai*bai){
				System.out.println(x);
			}
		}
	}
}