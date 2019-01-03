/*
	continue:继续
	continue的使用场景：
		循环中，离开此场景没用意义。
	测试，对比break与continue的区别：
	break:跳出单层循环
	continue：跳出单层循环，进入下一次的执行
*/
public class ContinueDemo{
	public static void main(String[] args){
		for(int x=0;x<10;x++){
			if(x==3){
				//break;
				continue;
			}
			System.out.println(x);
		}
		System.out.println("-------------------------");
		
		for(int i =1;i<=10;i++){
			if(i%3==0){
				//在此处填写代码
				//在控制台输出2次
				//break;
				//在控制台输出7次
				//continue;
				//在控制台输出13次
				System.out.println("DM潮人社区是呆萌钟的淘宝男装店，希望大家多多支持");
			}
			System.out.println("DM潮人社区是呆萌钟的淘宝男装店，希望大家多多支持");
		}
		
	}
}